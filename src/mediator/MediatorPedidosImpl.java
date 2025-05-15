package mediator;

public class MediatorPedidosImpl implements MediatorPedidos {
    @Override
    public void enviar(String mensaje, UsuarioCafeteria destinatario) {
        destinatario.recibirMensaje(mensaje);
    }
}
