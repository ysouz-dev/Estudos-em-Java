/* objetivo:
Crie um método que receba um array de inteiros e retorne o maior valor do array. */

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio68 {

    public static int[] adicionaElemento(int[] array, int valorAdicionado) {
        int[] novoArray = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];
        }

        novoArray[array.length] = valorAdicionado;
        return novoArray;
    }

    public static int maxValue(int[] array) {
        int maior = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                maior = array[i];
            } else if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] listaDeNumeros = new int[0];
        int numero;
        do {
            System.out.print("Digite um número (999 para parar): ");
            numero = scanner.nextInt();
            if (numero != 999) {
                listaDeNumeros = adicionaElemento(listaDeNumeros, numero);
            }
        } while (numero != 999);

        System.out.println("------------------------------");
        System.out.printf("Maior número digitado: %d%n", maxValue(listaDeNumeros));
        System.out.println("------------------------------");
        scanner.close();
    }
}