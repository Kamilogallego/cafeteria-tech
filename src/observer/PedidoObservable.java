package observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoObservable {
    private List<Observador> observadores = new ArrayList<>();
    private String estado;

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObservadores();
    }

    public String getEstado() {
        return estado;
    }

    private void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.actualizar(estado);
        }
    }
}
