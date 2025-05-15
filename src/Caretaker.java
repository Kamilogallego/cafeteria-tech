import memento.MementoPedido;

import java.util.Stack;

public class Caretaker {
    private final Stack<MementoPedido> historial = new Stack<>();

    public void guardarEstado(MementoPedido memento) {
        System.out.println("Guardando estado: " + memento.getEstado());
        historial.push(memento);
    }

    public MementoPedido getUltimoEstado() {
        if (!historial.isEmpty()) {
            System.out.println("Restaurando al último estado.");
            return historial.pop();
        } else {
            System.out.println("No hay estados guardados.");
            return null;
        }
    }
}