/* Leia 20 números inteiros (0 a 9)
Use um array auxiliar para contar quantas vezes cada número aparece. */

package exercicios.arrays;

import java.util.Scanner;

public class Exercicio45{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int listaDeNumeros[] = new int[20];

        for (int i = 0; i < listaDeNumeros.length; i++) {
            do {
                System.out.printf("Digite o %d° número: ", i+1);
                listaDeNumeros[i] = scanner.nextInt();

                if (listaDeNumeros[i] < 0 || listaDeNumeros[i] > 9) {
                    System.out.println("Error: O número precisa estar entre 0 e 9.");
                }

            } while (listaDeNumeros[i] < 0 || listaDeNumeros[i] > 9);
        }

        int listaDeAparicoes[] = new int[10];
        for (int i = 0; i < listaDeAparicoes.length; i++) {
            for (int numero : listaDeNumeros) {
                if (numero == i) {
                    listaDeAparicoes[i]++;
                }
            }
        }

        System.out.println("------------------------------");

        for (int i = 0; i < listaDeAparicoes.length; i++) {
            System.out.printf("%d apareceu %d vezes%n", i, listaDeAparicoes[i]);
        }

        System.out.println("------------------------------");
        scanner.close();
    }
}