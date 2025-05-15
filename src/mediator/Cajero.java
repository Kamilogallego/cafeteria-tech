package mediator;

public class Cajero extends UsuarioCafeteria {
    public Cajero(String nombre, MediatorPedidos mediator) {
        super(nombre, mediator);
    }

    public void solicitarPreparacion(String mensaje, UsuarioCafeteria barista) {
        mediator.enviar(mensaje, barista);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Cajero " + nombre + " recibe: " + mensaje);
    }
}