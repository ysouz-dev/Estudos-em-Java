package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Qual peso da nota 1: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Qual peso da nota 2: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Qual peso da nota 3: ");
        double peso3 = scanner.nextDouble();

        double somaNotas = nota1 * peso1 + nota2 * peso2 + nota3 * peso3;
        double somaPesos = peso1 + peso2 + peso3;
        double media = somaNotas / somaPesos;
        
        System.out.printf("A média ponderada das suas notas: %.2f pts", media);
        scanner.close();

    }
}