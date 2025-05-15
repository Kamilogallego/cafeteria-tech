package state;

public class EnEsperaState implements EstadoPedido {
    @Override
    public void siguiente(PedidoContexto pedido) {
        pedido.setEstado(new EnPreparacionState());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado: En espera");
    }

    @Override
    public String getNombreEstado() {
        return "En espera";
    }
}