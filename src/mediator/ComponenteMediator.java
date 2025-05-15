package mediator;

public abstract class ComponenteMediator implements Observador {
    protected mediator.MediatorPedidos mediator;

    public void setMediator(mediator.MediatorPedidos mediator) {
        this.mediator = mediator;
    }

    public abstract void recibir(String mensaje);

    public abstract void actualizar(Pedido pedido);
}