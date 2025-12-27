/* Leia um número inteiro.
Informe se ele é par ou ímpar.*/


package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        String tipo;

        if (numero % 2 == 0) {
            tipo = "par";
        } else {
            tipo = "ímpar";
        }

        System.out.printf("O número digitado é %s", tipo);
        scanner.close();
    }
}