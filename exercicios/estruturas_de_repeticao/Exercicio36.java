/* Leia um número maior ou igual a 0
Se negativo, peça novamente
calcule o fatorial */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termo;

        System.out.println("==========================\n" +
                " Calculadora de fatorial\n" +
                "==========================");
        while (true) {
            System.out.print("Digite o termo: ");
            termo = scanner.nextInt();

            if (termo < 0) {
                System.out.println("Error: O número não pode ser negativo.");
                continue;
            }
            System.out.println("==========================");
            break;

        }

        int fatorial = 1;
        String separador = "x";

        for (int i = termo; i >= 1; i--) {
            fatorial *= i;
            if (i == 1) {
            separador = "=";
            }

            System.out.printf("%d %s ", i, separador);
        }
        System.out.println(fatorial);
        scanner.close();
    }
}