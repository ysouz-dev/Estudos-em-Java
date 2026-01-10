/* Leia: 
- Tamanho do array (maior ou igual a 2)
- Valores inteiros 
Encontre o segundo maior valor diferente
Mostre: 
o valor ou informar que não existe*/

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // adiciona e valida o tamanho da lista
        int tamanho;
        do {
            System.out.print("Digite o tamanho da lista: ");
            tamanho = scanner.nextInt();

            if (tamanho < 2) {
                System.out.println("Error: O tamanho da lista deve ser maior ou igual a 2.");
            }
        } while (tamanho < 2);

        int[] listaDeNumeros = new int[tamanho];
        
        // adiciona numeros na lista
        for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.printf("Digite o %d° número para a lista: ", i+1);
            listaDeNumeros[i] = scanner.nextInt();
        }

        // ordena lista
        Arrays.sort(listaDeNumeros);

        // procura o segundo maior valor
        int maiorValor = listaDeNumeros[listaDeNumeros.length-1];
        int segundoMaiorValor = 0;
        int contagemDeIguais = 0;
        for (int i = listaDeNumeros.length - 1; i >= 0; i--) {
            if (listaDeNumeros[i] != maiorValor) {
                segundoMaiorValor = listaDeNumeros[i];
                break;
            } else {
                contagemDeIguais++;
            }
        }

        // verifica se existe igualdade
        String existe;
        if (contagemDeIguais == listaDeNumeros.length) {
            existe = "Não existe valor diferente";
        } else {
            existe = "Segundo maior valor diferente é o %d".formatted(segundoMaiorValor);
        }

        // saída
        System.out.println("------- LISTA DIGITADA -------");
        System.out.println(Arrays.toString(listaDeNumeros));
        System.out.println("------------------------------");
        System.out.println("Resultado: " + existe);
        scanner.close();
    }
}