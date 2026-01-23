/* Objetivo: 
Crie um método que receba um array de inteiros e 
retorne um novo array com os valores invertidos.*/

package exercicios.metodos;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio70 {

    public static int[] adicionaElemento(int[] array, int valorAdicionado) {
        int[] arrayNova = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            arrayNova[i] = array[i];
        }

        arrayNova[array.length] = valorAdicionado;
        return arrayNova;
    }
    
    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int pos = array.length - 1;
            reverse[pos - i] = array[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listaDeNumeros = new int[0];
        int numero;
        do {
            System.out.print("Digite um número (999 para parar): ");
            numero = scanner.nextInt();

            if (listaDeNumeros.length == 0 && numero == 999) {
                numero = 0;
                System.out.println("O flag não é considerado um número! Digite pelo menos um número.");
                continue;
            }
            
            if (numero != 999) {
                listaDeNumeros = adicionaElemento(listaDeNumeros, numero);
            }
        
        } while (numero != 999);
        
        System.out.println("---------------Lista Original-----------------");
        System.out.println(Arrays.toString(listaDeNumeros));
        System.out.println("----------------------------------------------");
        System.out.println("---------------Lista Inversa-----------------");
        System.out.println(Arrays.toString(reverseArray(listaDeNumeros)));
        System.out.println("----------------------------------------------");
        scanner.close();
    }
}