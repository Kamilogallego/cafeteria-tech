package state;

public class EntregadoState implements EstadoPedido {

    @Override
    public void siguiente(Pedido pedido) {
        System.out.println("El pedido ya ha sido entregado. No se puede cambiar a otro estado.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El pedido está actualmente en estado: Entregado.");
    }

    @Override
    public String toString() {
        return "Entregado";
    }
}