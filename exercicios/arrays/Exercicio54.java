/* Objetivo:
- verificar se a array é um palíndromo. (Uma sequência que é igual de frente pra trás.)
Regras: 
- tamanho ≥ 1
- números podem ser negativos
- não pode criar outra array
- só comparar valores*/

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // verifica e lê o tamanho da array
        int tamanho;
        do {
            System.out.print("Digite o tamanho da lista: ");
            tamanho = scanner.nextInt();
            if (tamanho < 1) {
                System.out.println("Error: O tamanho da lista deve ser maior ou igual a 1.");
            }
        } while (tamanho < 1);

        // cria e adiciona elementos na array
        int[] listaDeNumeros = new int[tamanho];
        for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.printf("Digite o %d° numero da lista: ", i + 1);
            listaDeNumeros[i] = scanner.nextInt();
        }

        // compara valores
        int contadorIgualdade = 0;

        for (int i = 0; i < listaDeNumeros.length; i++) {
            if (listaDeNumeros[i] == listaDeNumeros[(listaDeNumeros.length - 1) - i]) {
                contadorIgualdade++;
            }
        }

        // verifica se é um palíndromo
        boolean palindromo = false;
        if (listaDeNumeros.length == contadorIgualdade) {
            palindromo = true;
        }

        // saida

        System.out.println("------- LISTA DIGITADA -------");
        System.out.println(Arrays.toString(listaDeNumeros));
        System.out.println("------------------------------");

        if (palindromo) {
            System.out.println("A lista é um palíndromo.");
        } else {
            System.out.println("A lista não é um palíndromo.");
        }
        System.out.println("------------------------------");
        scanner.close();
    }
}