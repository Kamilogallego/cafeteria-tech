package state;

public interface EstadoPedido {
    void siguiente(Pedido pedido); // Cambia al siguiente estado
    void mostrarEstado();          // Muestra el estado actual
}