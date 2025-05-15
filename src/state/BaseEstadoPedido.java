package state;

import Observer.Pedido;

public abstract class BaseEstadoPedido {
    public abstract void siguiente(Pedido pedido);
    public abstract void mostrarEstado();
}