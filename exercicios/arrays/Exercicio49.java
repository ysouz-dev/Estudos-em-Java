/* Leia:
 - Tamanho do array (deve ser maior que 0)
 - Valores inteiros
 Mostre: 
 - O número mais frequente da array 
 - Se empatar mostre o menor valor*/

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // recebe e valida o tamanho da lista
        int tamanho;
        do {
            System.out.print("Quantos números irá comparar na lista? ");
            tamanho = scanner.nextInt();

            if (tamanho <= 0) {
                System.out.println("Error: O tamanho da lista deve ser maior que 0.");
            }
        } while (tamanho <= 0);

        System.out.println("----------------------------");

        // adiciona numeros na lista
        int[] listaDeNumeros = new int[tamanho];
        for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.printf("Digite o %d° número da lista: ", i + 1);
            listaDeNumeros[i] = scanner.nextInt();
        }

        // verifica aparições

        int numeroMaisFrequente = 0;
        int maiorQuantidadeDeVezes = 0;
        int contador = 0;
        int voltas = 0;

        for (int numero : listaDeNumeros) {
            contador = 0;
            for (int i = 0; i < listaDeNumeros.length; i++) {
                if (numero == listaDeNumeros[i]) {
                    contador++;
                }
            }
            if (voltas == 0) {
                numeroMaisFrequente = numero;
                maiorQuantidadeDeVezes = contador;

            } else if (contador > maiorQuantidadeDeVezes) {
                numeroMaisFrequente = numero;
                maiorQuantidadeDeVezes = contador;
            } else if (contador == maiorQuantidadeDeVezes && numero < numeroMaisFrequente) {
                numeroMaisFrequente = numero;
                maiorQuantidadeDeVezes = contador;
            }
            voltas++;
        }

        // saída
        System.out.println("------- LISTA DIGITADA -------");
        System.out.println(Arrays.toString(listaDeNumeros));
        
        System.out.println("----------");
        System.out.printf("Numero mais frequente: %d %nQuantidade de aparições: %d%n",
                        numeroMaisFrequente, maiorQuantidadeDeVezes);
        scanner.close();
    }
}