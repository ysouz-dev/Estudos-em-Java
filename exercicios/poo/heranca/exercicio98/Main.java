/* Crie:
- Uma classe base Pedido
- Classes derivadas como PedidoNacional e PedidoInternacional
- Um enum StatusPedido para controlar o estado do pedido
Regras:
- Um pedido internacional pode ter taxas adicionais
- O status deve controlar o fluxo (aguardando, enviado, entregue)
- Não é possível entregar um pedido que não foi enviado */

package exercicios.poo.heranca.exercicio98;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PedidoNormal pedido1 = new PedidoNormal();
        PedidoInternacional pedido2 = new PedidoInternacional();
        ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);

        // mostra resumo de cada pedido
        for (Pedido pedido : listaPedidos) {
            pedido.resumo();
            System.out.println("-------------------");
        }

        // envia cada pedido
        for (Pedido pedido : listaPedidos) {
            pedido.enviarPedido();
        }

        // entrega somente o pedido de id 1001
        for (Pedido pedido : listaPedidos) {
            if (pedido.getId() == 1001) {
                pedido.entregarPedido();
            }
        }

        // mostra resumo de cada pedido
        for (Pedido pedido : listaPedidos) {
            pedido.resumo();
            System.out.println("---------------");
        }

        // testa entregar os dois pedidos com um já entregue
        for (Pedido pedido : listaPedidos) {
            pedido.entregarPedido();
        }
    }
}
