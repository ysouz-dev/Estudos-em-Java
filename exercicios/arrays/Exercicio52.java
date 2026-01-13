/* Objetivo:
Criar um novo array contendo apenas os valores que aparecem UMA ÚNICA vez no array original. */

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // valida e define o tamanho da array original
        int tamanho;
        do {
            System.out.print("Digite o tamanho da lista: ");
            tamanho = scanner.nextInt();
            if (tamanho < 1) {
                System.out.println("Error: O tamanho da lista deve ser maior que 0.");
            }
        } while (tamanho < 1);

        // cria e adiciona elementos na array original
        int[] listaDeNumeros = new int[tamanho];
        for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.printf("Digite o %d° número da lista: ", i+1);
            listaDeNumeros[i] = scanner.nextInt();
        }

        // conta se existem valores unicos e cria a lista de unicos
        int aparicoes;
        int quantidadeNumerosUnicos = 0;

        for (int i = 0; i < listaDeNumeros.length; i++) {
            aparicoes = 0;
            for (int numero : listaDeNumeros) {
                if (listaDeNumeros[i] == numero) {
                    aparicoes++;
                }
            }
            if (aparicoes == 1) {
                quantidadeNumerosUnicos++;
            }
        }
        int[] listaDeUnicos = new int[quantidadeNumerosUnicos];

         // verifica se existem numeros unicos
        boolean existeUnicos = true;
        int indiceListaUnicos = 0;

        if (listaDeUnicos.length > 0) {
            // adiciona os numeros unicos a lista de unicos
            for (int j = 0; j < listaDeNumeros.length; j++) {
                aparicoes = 0;
                for (int numero : listaDeNumeros) {
                    if (listaDeNumeros[j] == numero) {
                        aparicoes++;
                    }
                }
                if (aparicoes == 1) {
                    listaDeUnicos[indiceListaUnicos] = listaDeNumeros[j];
                    indiceListaUnicos++;
                }
            }

        }  else {
            existeUnicos = false;
        }

        // saida
        System.out.println("------- LISTA DIGITADA -------\n" +
                        Arrays.toString(listaDeNumeros) + 
                        "\n------------------------------");
        
        if (existeUnicos) {
            System.out.println("Lista de únicos\n" + 
                            Arrays.toString(listaDeUnicos) +
                            "\n------------------------------");
        } else {
            System.out.println("A lista não possue números únicos.\n" + 
                                "------------------------------");
        }
        scanner.close(); 
    }
}