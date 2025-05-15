package mediator;

public abstract class Cajero extends ComponenteMediator {
    @Override
    public void recibir(String mensaje) {
        System.out.println("Cajero: Recibió mensaje -> " + mensaje);
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Cajero: Actualización -> " + mensaje);
    }

    @Override
    public void actualizar(Pedido pedido) {
        System.out.println("Cajero: El pedido cambió a estado -> " + pedido.getEstado());
    }
}