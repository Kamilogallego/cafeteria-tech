package mediator;

public abstract class Barista {
    protected MediatorPedidos mediator;

    public void setMediator(MediatorPedidos mediator) {
        this.mediator = mediator;
    }

    public abstract void recibir(String mensaje);
}