package memento;

import java.util.Stack;

public class Caretaker {
    private final Stack<MementoPedido> historial = new Stack<>();

    public void guardarEstado(MementoPedido memento) {
        historial.push(memento);
    }

    public MementoPedido getUltimoEstado() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}