/* Criar um método que recebe um número e retorna:
- true → se for par
- false → se for ímpar */

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio62 {

    // metodo que retorna se é par ou não
    public static boolean isPar(int numero) {
        boolean par = true;
        if (numero % 2 != 0) {
            par = false;
        }
        return par;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lê e valida o número que será verificado
        int numero;
        do {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("Error: O número não pode ser negativo");
            }
        } while (numero < 0);

        // saida
        System.out.println("------------------------------");       
        if (isPar(numero)) {
            System.out.printf("O número %d é par.%n", numero);
        } else {
            System.out.printf("O número %d é ímpar.%n", numero);
        }
        scanner.close();
    }
}