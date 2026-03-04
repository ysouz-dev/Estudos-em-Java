/*Crie uma classe Pagamento com um enum MetodoPagamento
Regras:
- Enum deve ter atributo "taxa"
- A classe deve calcular o valor final da taxa
- Não pode processar pagamento duas vezes
- Deve ter status de pagamento: 
    - PENDENTE
    - PROCESSADO
    - CANCELADO*/

package exercicios.poo.enumeracao.exercicio90;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new Pagamento(100, "pix");
        System.out.println("---------- Resumo pagamento 1 ----------");
        pagamento1.resumoPagamento();
        pagamento1.realizarPagamento();

        Pagamento pagamento2 = new Pagamento(50, "crédito");
        System.out.println("---------- Resumo pagamento 2 ----------");
        pagamento2.resumoPagamento();
        pagamento2.cancelarPagamento();

        System.out.println("---------- Resumo pagamento 1 ----------");
        pagamento1.resumoPagamento();

        System.out.println("---------- Resumo pagamento 2 ----------");
        pagamento2.resumoPagamento();

        // tenta realizar pagamento ja cancelado/processado
        pagamento1.realizarPagamento();

    }
}
