package observer;

import Memento.MementoPedido;
import State.EstadoPedido;
import State.EnEsperaState;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private EstadoPedido estado; // Estado actual del pedido
    private final List<Observador> observadores = new ArrayList<>();

    public Pedido() {
        this.estado = new EnEsperaState(); // Estado inicial
    }

    // Cambia el estado del pedido
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
        notificarObservadores(); // Notifica a los observadores
    }

    // Cambia al siguiente estado
    public void siguienteEstado() {
        estado.siguiente(this);
        notificarObservadores();
    }

    // Devuelve el estado actual como cadena
    public String getEstado() {
        return estado.toString();
    }

    public void mostrarEstado() {
        System.out.println("Estado actual: " + getEstado());
    }

    // Métodos del patrón Observer
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(getEstado());
        }
    }

    // Métodos del patrón Memento
    public MementoPedido crearMemento() {
        return new MementoPedido(getEstado());
    }

    public void restaurar(MementoPedido memento) {
        switch (memento.getEstado()) {
            case "En espera":
                setEstado(new EnEsperaState());
                break;
            case "En preparación":
                setEstado(new State.EnPreparacionState());
                break;
            case "Listo":
                setEstado(new State.ListoState());
                break;
            case "Entregado":
                setEstado(new State.EntregadoState());
                break;
        }
    }
}
