/* Objetivo
Encontrar o tamanho da maior sequência crescente contínua dentro do array. 
ex: array: [1, 2, 2, 3, 4, 1, 2, 3, 4, 5]
1, 2, 3, 4, 5 -> tamanho 5

resultado final: 5 */

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // valida o tamanho da lista
        int tamanho;
        do {
            System.out.print("Digite o tamanho da lista: ");
            tamanho = scanner.nextInt();

            if (tamanho < 1) {
                System.out.println("Error: o tamanho da lista deve ser maior ou igual a 1.");
            }
        } while (tamanho < 1);

        // adiciona numeros a lista
        int[] listaDeNumeros = new int[tamanho];
        for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.printf("Digite o %d° número da lista: ", i+1);
            listaDeNumeros[i] = scanner.nextInt();
        }
        
        // procura a maior sequencia
        int maiorSequencia = 1;
        int contadorDeSequencia = 1;

        for (int i = listaDeNumeros.length-1; i >= 0; i--) {
            if (i != 0) {
                if (listaDeNumeros[i] > listaDeNumeros[i-1]) {
                    contadorDeSequencia++;
                } else {
                    if (contadorDeSequencia > maiorSequencia) {
                        maiorSequencia = contadorDeSequencia;
                    }
                    contadorDeSequencia = 1;
                }
            } else {
                if (contadorDeSequencia > maiorSequencia) {
                    maiorSequencia = contadorDeSequencia;
                }
            }
        }

        // verifica se existe alguma sequencia
        boolean existeSequencia = false;
        
        if (maiorSequencia != 1) {
            existeSequencia = true;
        }
    
        // saída
        System.out.println("-----------------------------");
        System.out.println("------- LISTA DIGITADA ------\n" + 
                        Arrays.toString(listaDeNumeros) + 
                        "\n-----------------------------");
        if (existeSequencia) {
            System.out.printf("Maior sequência: Tamanho %d.%n", maiorSequencia);
        } else {
            System.out.println("Essa lista não possui nenhuma sequência.");
        }
        scanner.close();
    }
}