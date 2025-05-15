package state;

public class PedidoContexto {
    private EstadoPedido estado;

    public PedidoContexto() {
        this.estado = new EnEsperaState();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void siguienteEstado() {
        estado.siguiente(this);
    }

    public void mostrarEstado() {
        estado.mostrarEstado();
    }

    public String getNombreEstado() {
        return estado.getNombreEstado();
    }
}
