package mediator;

public abstract class UsuarioCafeteria {
    protected MediatorPedidos mediator;
    protected String nombre;

    public UsuarioCafeteria(String nombre, MediatorPedidos mediator) {
        this.nombre = nombre;
        this.mediator = mediator;
    }

    public abstract void recibirMensaje(String mensaje);
}
