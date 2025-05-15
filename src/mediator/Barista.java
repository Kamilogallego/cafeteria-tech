package mediator;

public class Barista extends UsuarioCafeteria {
    public Barista(String nombre, MediatorPedidos mediator) {
        super(nombre, mediator);
    }

    public void avisarEntrega(String mensaje, UsuarioCafeteria repartidor) {
        mediator.enviar(mensaje, repartidor);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Barista " + nombre + " recibe: " + mensaje);
    }
}