package mediator;

public abstract class Funcionario {

    protected Mediator mediator;

    public Funcionario(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receberMensagem(String mensagem);
}