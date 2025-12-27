/* Leia duas notas (double) e calcule a média.
Mostre:
"Aprovado" se a média for maior ou igual a 7
"Reprovado" caso contrário */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("A segunda: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        String situacao;

        if (media >= 7.0) {
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }

        System.out.printf("Sua média foi de %.2f pts. Situação: %s", media, situacao);
        scanner.close();
    }
}