/* Crie um sistema de Entrega.
Tipos de entrega:
- NORMAL (5 dias)
- EXPRESSA (2 dias)
- SAME DAY (1 dia)
Status do pedido:
- AGUARDANDO
- ENVIADO
- ENTREGUE
Regras:
- Não pode entregar se não foi enviado
- Não pode enviar duas vezes */

package exercicios.poo.enumeracao.exercicio94;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(TipoEntrega.NORMAL);
        p1.resumo();
        System.out.println("----------");

        p1.enviarPedido();
        p1.resumo();
        System.out.println("----------");

        p1.entregarPedido();
        p1.resumo();
        System.out.println("----------");

        // testa enviar pedido depois de ja entregue
        p1.enviarPedido();

    }
}
