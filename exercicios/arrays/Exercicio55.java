/* objetivo:
- remover os elementos duplicados, mantendo apenas a primeira ocorrência de cada número 
Regras importantes:
- não usar estruturas prontas (Set, List, etc.)
- usar apenas arrays
- a ordem importa
- números podem ser negativos*/

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // verifica e lê o tamanho da lista
        int tamanho;
        do {
            System.out.print("Digite o tamanho desejado da lista: ");
            tamanho = scanner.nextInt();
            if (tamanho < 1) {
                System.out.println("Error: O tamanho da lista deve ser maior que 0.");
            }
        } while (tamanho < 1);
        
        // cria e adiciona elementos na array
        int[] listaDeNumeros = new int[tamanho];
        for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.printf("Digite o %d° número da lista: ", i+1);
            listaDeNumeros[i] = scanner.nextInt();
        }

        // cria e adiciona elementos sem duplicações em uma array
        boolean existe = false;
        int[] listaSemRepeticoes = new int[listaDeNumeros.length];
        int contadorDeRepeticoes = 0;
        Arrays.fill(listaSemRepeticoes, Integer.MIN_VALUE);

        for (int i = 0; i < listaDeNumeros.length; i++) {
            existe = false;
            for (int k = 0; k < listaDeNumeros.length; k++) {
                if (listaDeNumeros[i] == listaSemRepeticoes[k]) {
                    existe = true;
                }
            }    

            if (!existe) {
                listaSemRepeticoes[contadorDeRepeticoes] = listaDeNumeros[i];
                contadorDeRepeticoes++;
            }
        }

        // cria e adiciona elementos na array final
        int[] listaFinal = new int[contadorDeRepeticoes];
        for (int i = 0; i < contadorDeRepeticoes; i ++) {
            listaFinal[i] = listaSemRepeticoes[i];
        }

        // saida
        System.out.println("------------------------------");
        System.out.println("------- LISTA DIGITADA -------");
        System.out.println(Arrays.toString(listaDeNumeros));
        System.out.println("---- LISTA SEM DUPLICAÇÕES ----");
        System.out.println(Arrays.toString(listaFinal));
        
        scanner.close();
    }
}