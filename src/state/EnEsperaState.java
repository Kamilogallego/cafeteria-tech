package state;

import observer.Pedido;

public class EnEsperaState implements EstadoPedido {

    @Override
    public void siguiente(Pedido pedido) {
        System.out.println("Cambiando estado de 'En espera' a 'En preparación'.");
        pedido.setEstado(new EnPreparacionState());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El pedido está actualmente en estado: En espera.");
    }

    @Override
    public String toString() {
        return "En espera";
    }
}