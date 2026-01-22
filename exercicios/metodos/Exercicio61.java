/* Crie um método que receba um número inteiro e retorne se ele é positivo, negativo ou zero.
No main, leia vários números até o usuário digitar 0. */

package exercicios.metodos;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio61 {

    // metodo que define o operador 
    public static String verificaSinal (int numero) {
        String tipo;
        if (numero < 0) {
            tipo = "%d é negativo.".formatted(numero);
        } else if (numero > 0) {
            tipo = "%d é positivo.".formatted(numero);
        } else {
            tipo = "%d é igual a zero.".formatted(numero);
        }
        return tipo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 1;
        int numero;
        int contador = 0;

        // looping principal 
        int[] listaDeNumeros = new int[tamanho];
        do {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();


            // verifica se o número digitado é diferente da flag (0)
            if (numero != 0) {
                listaDeNumeros[contador] = numero;
                tamanho++;

                // inicializa uma array temporaria e copia os elementos da array principal
                int[] arrayTemporaria = new int[listaDeNumeros.length];
                for (int i = 0; i < arrayTemporaria.length; i++) {
                    arrayTemporaria[i] = listaDeNumeros[i];
                }
                
                // redefine o tamanho da array principal com o novo tamanho e adiciona os elementos anteriores
                listaDeNumeros = new int[tamanho];
                for (int i = 0; i < arrayTemporaria.length; i++) {
                    listaDeNumeros[i] = arrayTemporaria[i];
                }
                contador++;
            } else {
                int[] arrayTemporaria = new int[listaDeNumeros.length-1];
                for (int i = 0; i < arrayTemporaria.length; i++) {
                    arrayTemporaria[i] = listaDeNumeros[i];
                }

                listaDeNumeros = new int[arrayTemporaria.length];
                for (int i = 0; i < arrayTemporaria.length; i ++) {
                    listaDeNumeros[i] = arrayTemporaria[i];
                }
            }
        } while (numero != 0);

        // saída
        System.out.println("------ NÚMEROS DIGITADOS ------");
        System.out.println(Arrays.toString(listaDeNumeros));
        System.out.println("-------------------------------");
        for (int i = 0; i < contador; i++) {
            System.out.println("O número " + verificaSinal(listaDeNumeros[i]));
        }
        System.out.println("-------------------------------");
        scanner.close();
    }
}