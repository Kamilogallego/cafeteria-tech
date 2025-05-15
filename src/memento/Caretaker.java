package memento;

import java.util.Stack;

public class Caretaker {
    private Stack<MementoPedido> historial = new Stack<>();

    public void guardarEstado(MementoPedido memento) {
        historial.push(memento);
    }

    public MementoPedido getUltimoEstado() {
        return !historial.isEmpty() ? historial.pop() : null;
    }
}