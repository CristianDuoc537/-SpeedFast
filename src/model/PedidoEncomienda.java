package model;

public class PedidoEncomienda extends Pedido {
    private int pesoEncomienda;

    public PedidoEncomienda(int idPedido, String direccionEntrega, int pesoEncomienda) {
        super(idPedido, direccionEntrega, "Encomienda");
        this.pesoEncomienda = pesoEncomienda;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("### Pedido De Encomienda Nro: " + getIdPedido() + " ###");
        System.out.println("dir.Entrega: " + getDireccionEntrega());
        System.out.println("Buscando repartidor para encomienda de: " + pesoEncomienda + "Kg");

    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("### Asignacion de Encomienda Nro: " + getIdPedido() + " ###");
        System.out.println("Repartidor encontrado!!!");
        System.out.println("Repartidor asignado: " + nombreRepartidor);

    }
}
