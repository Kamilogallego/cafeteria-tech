package state;

public class EntregadoState implements EstadoPedido {
    @Override
    public void siguiente(PedidoContexto pedido) {
        System.out.println("No hay más estados.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado: Entregado");
    }

    @Override
    public String getNombreEstado() {
        return "Entregado";
    }
}