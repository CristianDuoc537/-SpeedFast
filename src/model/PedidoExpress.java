package model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Express");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("### Pedido Express Nro: " + getIdPedido() + " ###");
        System.out.println("dir.Entrega: " + getDireccionEntrega());
        System.out.println("Buscando repartidor mas cercano...");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("### Asignacion de Pedido Nro: " + getIdPedido() + " ###");
        System.out.println("Repartidor encontrado!!!");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }
}
