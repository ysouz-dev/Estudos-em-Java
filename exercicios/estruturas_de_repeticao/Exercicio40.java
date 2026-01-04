/* Leia um número e mostre a tabuada completa, validando entrada. */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplicando;
        
        do {
            System.out.print("Digite o número que deseja ver a tabuada: ");
            multiplicando = scanner.nextInt();

            if (multiplicando <= 0) {
                System.out.println("Error: O número precisa ser maior que 0.");
            }

        } while (multiplicando <= 0);

        System.out.printf("====================%n" +
                "   Tabuada do %d%n" +
                "====================%n", multiplicando);

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", multiplicando, i, multiplicando * i);
        }
        scanner.close();
    }
}