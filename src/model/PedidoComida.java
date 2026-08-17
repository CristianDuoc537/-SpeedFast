package model;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Comida");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("### Pedido De Comida Nro: " + getIdPedido() + " ###");
        System.out.println("dir.Entrega: " + getDireccionEntrega());
        System.out.println("Buscando repartidor con mochila termica...");

    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("### Asignacion de Pedido Nro: " + getIdPedido() + " ###");
        System.out.println("Repartidor encontrado!!!");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }
}
