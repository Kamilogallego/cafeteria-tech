package observer;

public class Cocina implements Observador {

    @Override
    public void actualizar(String estado) {
        System.out.println("Cocina notificada: El pedido está " + estado);
    }
}
