package memento;

public class MementoPedido {
    private final String estadoGuardado;

    public MementoPedido(String estado) {
        this.estadoGuardado = estado;
    }

    public String getEstadoGuardado() {
        return estadoGuardado;
    }
}