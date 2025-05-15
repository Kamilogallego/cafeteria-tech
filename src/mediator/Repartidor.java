package mediator;

public class Repartidor extends Barista{
    @Override
    public void recibir(String mensaje) {
        System.out.println("Repartidor: Entregando -> " + mensaje);
    }
}