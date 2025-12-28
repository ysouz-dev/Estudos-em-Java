/* Leia uma nota de 0 a 10 e mostre:
"Excelente"
"Bom"
"Regular"
"Insuficiente"
dependendo do valor da nota */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 10: ");
        double nota = scanner.nextDouble();
        String classificacao;

        if (nota <= 2.5) {
            classificacao = "Insuficiente";
        } else if (nota <= 5.0) {
            classificacao = "Regular";
        } else if (nota <= 7.5) {
            classificacao = "Bom";
        } else {
            classificacao = "Excelente";
        }

        System.out.printf("Nota: %.1f %nClassificação: %s%n", nota, classificacao);
        scanner.close();

    }
}