package state;

public class ListoState implements EstadoPedido {
    @Override
    public void siguiente(PedidoContexto pedido) {
        pedido.setEstado(new EntregadoState());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado: Listo");
    }

    @Override
    public String getNombreEstado() {
        return "Listo";
    }
}