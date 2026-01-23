/* Objetivo: 
Crie um método que receba um array de inteiros e retorne a soma de todos os elementos. */

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio67 {

    public static int[] adicionaArray(int[] array, int valorAdicionado){
        int[] novoArray = new int [array.length+1];
        
        for (int i = 0; i < array.length; i ++) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] listaDeNumeros = new int[0];
        int numero;
        do {
            System.out.print("Digite um número (999 para parar): ");
            numero = scanner.nextInt();

            if (numero != 999) {
                listaDeNumeros = adicionaArray(listaDeNumeros, numero);
            }
        } while (numero != 999);

        System.out.println("------------------------------");

        System.out.printf("Soma total dos números digitados: %d%n", somaArray(listaDeNumeros));
        scanner.close();
    }
}