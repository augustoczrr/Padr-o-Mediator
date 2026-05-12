package mediator;

public class CentralPizzaria implements Mediator {

    private Garcom garcom;
    private Cozinheiro cozinheiro;
    private Entregador entregador;

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public void setCozinheiro(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    @Override
    public void enviarMensagem(String mensagem, Funcionario funcionario) {

        if (funcionario instanceof Garcom) {
            cozinheiro.receberMensagem(mensagem);
        }

        else if (funcionario instanceof Cozinheiro) {
            entregador.receberMensagem(mensagem);
        }

        else if (funcionario instanceof Entregador) {
            garcom.receberMensagem(mensagem);
        }
    }
}