/* Desenvolva um programa em Java que:
- Solicite ao usuário o tamanho de uma lista de números inteiros, 
validando para que o valor seja maior que zero.
- Leia os números inteiros digitados e armazene-os em uma array.
- Solicite ao usuário um valor alvo.
- Verifique se existem dois números diferentes da lista cuja soma seja exatamente igual ao valor alvo.
- Caso existam, exiba os dois números encontrados e suas respectivas posições.
- Caso não existam, informe que não há combinação possível.
- O programa deve encerrar a busca assim que encontrar a primeira combinação válida.
 Restrições
- Não utilizar ArrayList, HashSet, Map ou qualquer estrutura dinâmica.
- Não ordenar a lista.
- Não utilizar três loops aninhados.
- Complexidade máxima permitida: O(n²).
- Usar apenas arrays e estruturas básicas de controle. */

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lê e verifica o tamanho da array
        int tamanho;
        do {
            System.out.print("Digite o tamanho desejado da lista: ");
            tamanho = scanner.nextInt();
            if (tamanho <= 0) {
                System.out.println("Error: O tamanho da lista deve ser maior que 0.");
            }
        } while (tamanho <= 0);

        // cria e adiciona elementos na array
        int[] listaDeNumeros = new int[tamanho];
        for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.printf("Digite o %d° número da lista: ", i + 1);
            listaDeNumeros[i] = scanner.nextInt();
        }

        System.out.println("------------------------------");

        // lê um valor alvo
        System.out.print("Digite um valor alvo: ");
        int valorAlvo = scanner.nextInt();

        // verifica se possue um par cuja a soma dê o valor alvo
        int primeiroPar = Integer.MIN_VALUE, segundoPar = Integer.MIN_VALUE;
        int posicaoPrimeiroPar = -1;
        int posicaoSegundoPar = -1;
        boolean parEncontrado = false;

        for (int i = 0; i < listaDeNumeros.length; i++) {
            for (int k = i+1; k < listaDeNumeros.length; k++) {
                if (listaDeNumeros[i] + listaDeNumeros[k] == valorAlvo) {

                    primeiroPar = listaDeNumeros[i];
                    segundoPar = listaDeNumeros[k];

                    posicaoPrimeiroPar = i;
                    posicaoSegundoPar = k;

                    parEncontrado = true;
                    break;
                }
            }
            if (parEncontrado) {
                break;
            }
        }

        String encontrouPar;
        if (posicaoPrimeiroPar < 0 && posicaoSegundoPar < 0) {
            encontrouPar = "Nenhum par encontrado para o valor alvo (%d) informado.".formatted(valorAlvo);
        } else {
            encontrouPar = "Par encontrado: %d (posição %d) e %d (posição %d).".formatted(primeiroPar,
                    posicaoPrimeiroPar, segundoPar, posicaoSegundoPar);
        }
        System.out.println("------------------------------");

        // saida
        System.out.println("------- LISTA DIGITADA -------");
        System.out.println(Arrays.toString(listaDeNumeros));
        System.out.println("------------------------------");
        System.out.println(encontrouPar);
        System.out.println("------------------------------");

        scanner.close();
    }
}