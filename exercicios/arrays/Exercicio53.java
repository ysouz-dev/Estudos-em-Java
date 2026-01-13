/* objetivo: 
Dado um array de números inteiros e um número K, 
faça a rotação do array para a direita em K posições. */

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // verifica e lê o tamanho da lista
        int tamanho;
        do {
            System.out.print("Digite o tamanho da lista: ");
            tamanho = scanner.nextInt();
            if (tamanho <= 0) {
                System.out.println("Error: O tamanho da lista deve ser maior que 0.");
            }
        } while (tamanho <= 0);
        
        //cria e adiciona elementos na lista
        int[] listaDeNumeros = new int[tamanho];
        for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.printf("Digite o %d° numero da lista: ", i+1);
            listaDeNumeros[i] = scanner.nextInt();
        }
        

        // cria uma copia da lista original
        int[] listaFixa = new int[listaDeNumeros.length];
        for (int i = 0; i < listaDeNumeros.length; i++) {
            listaFixa[i] = listaDeNumeros[i];
        }


        System.out.println("-------------------------------");
        
        // lendo numero da rotação
        int rotacao;
        while (true) {
            System.out.print("Deseja rotacionar quantas vezes para a direita? ");
            rotacao = scanner.nextInt();
            if (rotacao > 0) {
                if (rotacao > listaDeNumeros.length) {
                    rotacao %= listaDeNumeros.length;
                }
                break;
            } else {
                System.out.println("Error: O número da rotação precisa ser maior que 0.");
            }
        }
        

        System.out.println("-------------------------------");

        // rotaciona a array
        int ultimoNumero;
        int contadorDeVoltas = 0;

        while (contadorDeVoltas != rotacao) {
            contadorDeVoltas++;
            ultimoNumero = listaDeNumeros[listaDeNumeros.length-1];

            for (int j = listaDeNumeros.length-1; j >= 1; j--) {
                listaDeNumeros[j] = listaDeNumeros[j-1];
            }
            listaDeNumeros[0] = ultimoNumero;
        }

        // saida
        System.out.println("------- LISTA DIGITADA -------\n" + 
                        Arrays.toString(listaFixa) + 
                        "\n------ LISTA ROTACIONADA ------\n" +
                        Arrays.toString(listaDeNumeros));
        scanner.close();
    }
}