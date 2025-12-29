/* Entrada:
um tipo de cliente (1, 2 ou 3)
um valor de compra

 Regras:
tipo 1 → desconto se valor ≥ 100
tipo 2 → desconto se valor ≥ 200
tipo 3 → sempre tem desconto

Se o valor for ≤ 0, exibir "Valor inválido" e ignorar o tipo */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tipo de cliente (1, 2 ou 3): ");
        int codigoCliente = scanner.nextInt();

        System.out.print("Valor da compra R$: ");
        double valorDaCompra = scanner.nextDouble();

        double desconto = 0.3;
        String erro;

        if ((codigoCliente > 0 && codigoCliente < 4) && valorDaCompra > 0.0) {
            switch (codigoCliente) {
                case 1:
                    if (valorDaCompra >= 100) {
                        valorDaCompra -= desconto * valorDaCompra;
                        System.out.println("Desconto aplicado de 30% !");
                    }
                    System.out.printf("Valor total da compra: R$ %.2f%n", valorDaCompra);
                    break;

                case 2:
                    if (valorDaCompra >= 200) {
                        valorDaCompra -= desconto * valorDaCompra;
                        System.out.println("Desconto aplicado de 30% !");
                    }
                    System.out.printf("Valor total da compra: R$ %.2f%n", valorDaCompra);
                    break;

                case 3:
                    System.out.println("Desconto aplicado de 30% !");
                    valorDaCompra -= desconto * valorDaCompra;
                    System.out.printf("Valor total da compra: R$ %.2f", valorDaCompra);
                    break;                    
            }

        } else {
            if (codigoCliente < 1 || codigoCliente > 3) {
                erro = "Error: O tipo de cliente deve ser entre 1 e 3.";
            } else {
                erro = "Error: Valor da compra deve ser maior que 0.";
            }
            System.out.println(erro);
        }
        scanner.close();
    }
}