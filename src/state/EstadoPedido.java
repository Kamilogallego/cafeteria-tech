package state;

public interface EstadoPedido {
    void siguiente(PedidoContexto pedido);
    void mostrarEstado();
    String getNombreEstado();
}