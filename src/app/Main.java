package app;

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {
    public static void main(String[] args) {

        Pedido pedidoComida = new PedidoComida(
                1627,
                "Calle independencia");

        Pedido pedidoEncomienda = new PedidoEncomienda(
                3652,
                "Calle Las Acacias",
                55);

        Pedido pedidoExpress = new PedidoExpress(
                1542,
                "Avenida El Sol");


        System.out.println("__________________________________________________");
        System.out.println("");
        pedidoComida.asignarRepartidor();
        System.out.println("");
        pedidoComida.asignarRepartidor("Carlos");

        System.out.println("__________________________________________________");
        System.out.println("");
        pedidoEncomienda.asignarRepartidor();
        System.out.println("");
        pedidoEncomienda.asignarRepartidor("Sebastian");

        System.out.println("__________________________________________________");
        System.out.println("");
        pedidoExpress.asignarRepartidor();
        System.out.println("");
        pedidoExpress.asignarRepartidor("Diego");

    }
}


