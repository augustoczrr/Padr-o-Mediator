package mediator;

public class Cozinheiro extends Funcionario {

    public Cozinheiro(Mediator mediator) {
        super(mediator);
    }

    public void enviar(String mensagem) {
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Cozinheiro recebeu: " + mensagem);
    }
}