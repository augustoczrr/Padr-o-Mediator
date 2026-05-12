package mediator;

public class Entregador extends Funcionario {

    public Entregador(Mediator mediator) {
        super(mediator);
    }

    public void enviar(String mensagem) {
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Entregador recebeu: " + mensagem);
    }
}