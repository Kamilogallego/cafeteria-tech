package mediator;

public class Repartidor extends UsuarioCafeteria {
    public Repartidor(String nombre, MediatorPedidos mediator) {
        super(nombre, mediator);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Repartidor " + nombre + " recibe: " + mensaje);
    }
}