/*Leia:
* idade da pessoa
*
* Calcule e mostre:
* se a pessoa é maior de idade
se a idade está em uma faixa considerada “válida”, entre 0 e 120 */

package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idadeDaPessoa = scanner.nextInt();

        boolean idadeValida = (idadeDaPessoa >= 0 && idadeDaPessoa <= 120);
        String maiorDeIdade = (idadeDaPessoa >= 18) ? "Maior de idade": "Menor de idade";

        System.out.printf("A sua idade de %d anos é considerada válida: %b%n", idadeDaPessoa, idadeValida);
        System.out.printf("Você com %d anos é considerado: %s%n", idadeDaPessoa, maiorDeIdade);
        scanner.close();
    }
}