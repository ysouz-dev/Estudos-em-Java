/* Leia:
* um número inteiro
*
* Calcule e mostre:
* se o número é maior que 10
se o número é menor ou igual a 50 */

package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean resposta1 = (numero > 10) ? true : false;
        boolean resposta2 = (numero <= 50) ? true : false;

        System.out.printf("O número %d é maior que 10: %b%n", numero, resposta1);
        System.out.printf("O número %d é menor ou igual a 50: %b%n", numero, resposta2);
        scanner.close();
    }
}