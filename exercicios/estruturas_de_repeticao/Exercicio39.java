/* Leia um número > 1.
Informe se ele é primo ou não. */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================\n" +
                " Detector de número primo\n" +
                "==========================");

        int numero;
        while (true) {
            System.out.print(" Digite um número: ");
            numero = scanner.nextInt();
            if (numero < 1) {
                System.out.println(" Error: O número precisa ser maior que 0.");
                continue;
            }
            break;
        }

        System.out.println("==========================");

        int contadorDeDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            int divisor = numero % i;
            if (divisor == 0) {
                contadorDeDivisores++;
            }
        }
        
        String primo;
        if (contadorDeDivisores == 2) {
            primo = "é primo";
        } else {
            primo = "não é primo";
        }

        System.out.printf("O número %d %s%n", numero, primo);
        scanner.close();

    }
}