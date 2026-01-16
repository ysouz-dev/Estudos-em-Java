/* Desenvolva um programa em Java que:
- Solicite ao usuário o tamanho de uma lista de números inteiros, 
validando para que o valor seja maior que zero.
- Crie uma array com o tamanho informado e inicialize todos os seus elementos com um valor sentinela.
- Leia os números inteiros digitados pelo usuário e armazene-os na array.
- Ordene a lista utilizando o método Arrays.sort.
- Solicite ao usuário um número para busca.
- Realize a busca exclusivamente com Arrays.binarySearch, sem utilizar laços manuais para comparação.
- Informe se o número foi encontrado ou não e, caso exista, exiba sua posição na lista ordenada.
- Exiba a lista original e a lista ordenada ao final do programa.
Restrições:
- Não utilizar estruturas dinâmicas (como ArrayList).
- Não utilizar laços para realizar a busca.
- Utilizar obrigatoriamente Arrays.fill, Arrays.sort e Arrays.binarySearch. */

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // valida e lê o tamanho da array
        int tamanho;
        do {
            System.out.print("Digite o tamanho desejado da lista: ");
            tamanho = scanner.nextInt();
            if (tamanho <= 0) {
                System.out.println("Error: O tamanho da lista deve ser maior do que 0.");
            }
        } while (tamanho <= 0);

        // cria a array e incrementa um valor sentinela
        int[] listaDeNumeros = new int[tamanho];
        Arrays.fill(listaDeNumeros, Integer.MIN_VALUE);

        // lê números digitados e adiciona na array
        for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.printf("Digite o %d° número da lista: ", i+1);
            listaDeNumeros[i] = scanner.nextInt(); 
        }

        // cria e copia a lista original
        int[] copiaListaDeNumeros = new int[listaDeNumeros.length];
        for (int i = 0; i < listaDeNumeros.length; i++) {
            copiaListaDeNumeros[i] = listaDeNumeros[i];
        }

        //ordena a lista
        Arrays.sort(listaDeNumeros);

        // lê um numero para a busca e verifica a posicao dele
        System.out.print("Digite um número para verificar se ele existe na lista: ");
        int busca = scanner.nextInt();
        
        int posição = Arrays.binarySearch(listaDeNumeros, busca);
        
        // saida
        
        String existe;
        if (posição >= 0) {
            existe = "O número %d foi encontrado na posição %d.%n".formatted(busca, posição);
        } else {
            existe = "O número %d não existe na lista.".formatted(busca);
        }

        System.out.println("------------------------------");
        System.out.printf("Lista original: %s %nLista Ordenada: %s %n%s%n", 
        Arrays.toString(copiaListaDeNumeros), 
        Arrays.toString(listaDeNumeros), 
        existe
        );
        
        scanner.close();
    }
}