package mediator;

public class Garcom extends Funcionario {

    public Garcom(Mediator mediator) {
        super(mediator);
    }

    public void enviar(String mensagem) {
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Garçom recebeu: " + mensagem);
    }
}