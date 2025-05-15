package state;

public class ListoState implements EstadoPedido {

    @Override
    public void siguiente(Pedido pedido) {
        System.out.println("Cambiando estado de 'Listo' a 'Entregado'.");
        pedido.setEstado(new EntregadoState());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El pedido está actualmente en estado: Listo.");
    }

    @Override
    public String toString() {
        return "Listo";
    }
}