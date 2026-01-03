/* Leia números até digitar 0.
Some apenas os:
positivos
múltiplos de 2 ou 3 */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, somaDosNumeros=0;

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            if (numero != 0) {
                if ((numero % 2 == 0 || numero % 3 == 0) && numero > 0) {
                    somaDosNumeros += numero;
                }
            } else {
                break;
            }
        }
        
        System.out.printf("Soma dos números positivos multiplos de 2 ou 3: %d%n", somaDosNumeros);
        scanner.close();

    }
}