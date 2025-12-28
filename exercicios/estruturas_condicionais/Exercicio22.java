/* Leia dois números inteiros e mostre:
"Primeiro maior"
"Segundo maior"
"Iguais" */


package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Digite um número: ");
        numero1 = scanner.nextInt();
        
        System.out.print("Digite outro número: ");
        numero2 = scanner.nextInt();
        
        if (numero1 > numero2) {
            System.out.printf("O maior número é o primeiro (%d)", numero1);
        } else if (numero2 > numero1) {
            System.out.printf("O maior número é o segundo (%d)", numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }
        scanner.close();
    }
}