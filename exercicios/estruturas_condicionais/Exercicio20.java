/* Leia o valor de um produto.
Se o valor for maior que 100, aplique um desconto.
Caso contrário, mantenha o valor normal.
Mostre o valor final */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto R$: ");
        double precoDoProduto = scanner.nextDouble();
        int desconto = 20;


        if (precoDoProduto > 100) {
            precoDoProduto -= desconto / 100.0 * precoDoProduto;
            System.out.print("Compras acima de R$ 100.00 tem desconto de 20%");
        }

        System.out.printf("%nValor da compra: R$ %.2f", precoDoProduto);
        scanner.close();
    }
}