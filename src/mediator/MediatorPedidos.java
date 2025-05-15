package mediator;

public class MediatorPedidos {

    private Pedido pedido;

    public MediatorPedidos() {
        this.pedido = new Pedido(); // Inicializa el pedido correctamente
    }

    public void procesarPedido() {
        System.out.println("Procesando el pedido con estado: " + pedido.getEstado());
        pedido.siguienteEstado(); // Cambia al siguiente estado
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}