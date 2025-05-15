import mediator.Barista;
import mediator.Cajero;
import mediator.MediatorPedidosImpl;
import mediator.Repartidor;
import memento.Caretaker;
import memento.MementoPedido;
import observer.Cliente;
import observer.Cocina;
import observer.PedidoObservable;
import state.PedidoContexto;

public class Main {
    public static void main(String[] args) {
        // Observer + State + Memento
        PedidoObservable pedidoObservable = new PedidoObservable();
        Cliente cliente = new Cliente("Farid");
        Cocina cocina = new Cocina();
        pedidoObservable.agregarObservador(cliente);
        pedidoObservable.agregarObservador(cocina);

        PedidoContexto pedidoState = new PedidoContexto();
        Caretaker caretaker = new Caretaker();

        // Estado inicial
        pedidoState.mostrarEstado();
        pedidoObservable.setEstado(pedidoState.getNombreEstado());
        caretaker.guardarEstado(new MementoPedido(pedidoState.getNombreEstado()));

        // Estado: En preparación
        pedidoState.siguienteEstado();
        pedidoState.mostrarEstado();
        pedidoObservable.setEstado(pedidoState.getNombreEstado());
        caretaker.guardarEstado(new MementoPedido(pedidoState.getNombreEstado()));

        // Estado: Listo
        pedidoState.siguienteEstado();
        pedidoState.mostrarEstado();
        pedidoObservable.setEstado(pedidoState.getNombreEstado());
        caretaker.guardarEstado(new MementoPedido(pedidoState.getNombreEstado()));

        // Estado: Entregado
        pedidoState.siguienteEstado();
        pedidoState.mostrarEstado();
        pedidoObservable.setEstado(pedidoState.getNombreEstado());
        caretaker.guardarEstado(new MementoPedido(pedidoState.getNombreEstado()));

        // Restaurar estado anterior (ejemplo de cancelación)
        System.out.println("\n--- Pedido cancelado, restaurando estado anterior ---");
        MementoPedido memento = caretaker.getUltimoEstado(); // Entregado
        memento = caretaker.getUltimoEstado(); // Listo
        if (memento != null) {
            pedidoObservable.setEstado(memento.getEstadoGuardado());
            System.out.println("Estado restaurado: " + memento.getEstadoGuardado());
        }

        // Mediator
        System.out.println("\n--- Ejemplo Mediator ---");
        MediatorPedidosImpl mediator = new MediatorPedidosImpl();
        Cajero cajero = new Cajero("Ana", mediator);
        Barista barista = new Barista("Luis", mediator);
        Repartidor repartidor = new Repartidor("Carlos", mediator);

        cajero.solicitarPreparacion("Preparar café para Farid", barista);
        barista.avisarEntrega("Pedido de Farid listo para entregar", repartidor);
    }
}
