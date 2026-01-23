/* Objetivo: 
Crie um método que receba um array de inteiros e retorne a média dos valores. */

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio69 {

    public static int[] adicionaElemento(int[] array, int valorAdicionado) {
        int[] novoArray = new int[array.length+1];
        
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];
        }

        novoArray[array.length] = valorAdicionado;
        return novoArray;
    }

    public static int somaArray(int[] array) {
        int somaTotal = 0;
        for (int numero : array) {
            somaTotal += numero;
        }
        return somaTotal;
    }

    public static double mediaArray(int[] array) {
        return somaArray(array) / (double) array.length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listaDeNumeros = new int[0];
        while (true) {
            int numero;
            do {
                System.out.print("Digite um número (999 para parar): ");
                numero = scanner.nextInt();

                if (numero != 999) {
                    listaDeNumeros = adicionaElemento(listaDeNumeros, numero);
                }
            } while (numero != 999);

            if (listaDeNumeros.length == 0) {
                System.out.println("O flag (999) não é considerado um número! Digite pelo menos um número válido.");
            } else {
                break;
            }
        }
        System.out.println("----------------------------");
        System.out.printf("Média dos números digitados: %.2f%n", mediaArray(listaDeNumeros));
        System.out.println("----------------------------");
        scanner.close();
    }
}