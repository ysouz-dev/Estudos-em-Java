/* Leia base e expoente.
Calcule a potência usando loop, não Math.pow(). */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================");
        System.out.println(" Calculadora de Potenciação");
        System.out.println("============================");

        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double potencia = 1;
        for (int i = 1; i <= expoente; i++) {
            potencia *= base;
        }
        
        System.out.println("============================");
        System.out.println("Resultado = " + potencia);
        scanner.close();

    }
}