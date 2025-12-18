package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf("Seu retângulo com %.1f cm de altura" +
                " e %.1f cm de base, possui area de %.1f cm.%n",
                altura, base, area);
        scanner.close();

    }
}