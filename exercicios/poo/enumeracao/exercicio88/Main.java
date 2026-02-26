/* Crie um sistema que controla pedidos de um restaurante */

package exercicios.poo.enumeracao.exercicio88;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Yago");
        pedido1.adicionarItem("X-Bacon");
        pedido1.adicionarItem("X-Salada");
        pedido1.mostrarResumo();
        System.out.println("-------------------");

        pedido1.avancarComPedido();
        pedido1.mostrarResumo();
        System.out.println("-------------------");

        pedido1.adicionarItem("Porção de batata");
        pedido1.avancarComPedido();
        pedido1.mostrarResumo();
        System.out.println("-------------------");

        Pedido pedido2 = new Pedido("Souza");
        pedido2.adicionarItem("X-Egg");
        pedido2.adicionarItem("refrigerante");
        pedido2.mostrarResumo();
        System.out.println("-------------------");

        pedido2.avancarComPedido();
        pedido2.avancarComPedido();
        pedido2.mostrarResumo();
        System.out.println("-------------------");

        pedido1.avancarComPedido();
        pedido2.avancarComPedido();
        pedido1.mostrarResumo();
        System.out.println("-------------------");
        pedido2.mostrarResumo();

        // testa adicionar item com pedido entregue
        pedido1.adicionarItem("refrigerante");
    }
}
