package state;

public class EnPreparacionState implements EstadoPedido {
    @Override
    public void siguiente(PedidoContexto pedido) {
        pedido.setEstado(new ListoState());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado: En preparación");
    }

    @Override
    public String getNombreEstado() {
        return "En preparación";
    }
}