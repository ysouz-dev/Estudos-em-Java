package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperatura(em °C): ");
        double celsius = scanner.nextDouble();

        double conversao = (celsius * 9 / 5) + 32;

        System.out.printf("Sua temperatura de %.0f °C " +
                "convertida para fahrenheit fica %.0f °F%n",
                celsius, conversao);
        scanner.close();
    }
}