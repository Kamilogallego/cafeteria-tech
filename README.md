# Cafetería Tech

Simulación de un flujo de pedidos de cafetería en Java. Este repositorio es un fork de un proyecto colaborativo y reúne varios patrones de diseño en un ejemplo concreto.

## Qué muestra

- **Observer:** notifica a cliente y cocina cuando cambia el estado del pedido.
- **State:** representa el avance del pedido por distintas etapas.
- **Memento:** guarda estados para recuperar uno anterior.
- **Mediator:** coordina la comunicación entre cajero, barista y repartidor.

La clase de entrada es [`src/Main.java`](src/Main.java). Las implementaciones están organizadas en `src/observer`, `src/state`, `src/memento` y `src/mediator`.

## Cómo explorarlo

Abre el proyecto en un IDE con Java y ejecuta la clase `Main`. La salida en consola muestra las transiciones del pedido y la interacción entre los participantes.
