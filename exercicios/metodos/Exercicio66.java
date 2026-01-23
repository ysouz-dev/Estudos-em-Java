/* Crie um método que preencha um array de inteiros com valores digitados pelo usuário.
Outro método deve imprimir esse array. (sem arrays.toString)*/

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio66 {

    public static int[] adicionaArray(int[] array, int numeroInteiro, int posicao) {
        array[posicao] = numeroInteiro;

        int[] arrayTemporaria = new int[array.length];
        for (int i = 0; i < arrayTemporaria.length; i++) {
            arrayTemporaria[i] = array[i];
        }

        int novoTamanho = array.length + 1;

        array = new int[novoTamanho];
        for (int i = 0; i < arrayTemporaria.length; i++) {
            array[i] = arrayTemporaria[i];
        }
        return array;
    }

    public static void mostraArray(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            String separador = "";

            if (i != array.length-2) {
                separador = ", ";
            }

            if (i == 0) System.out.print("[");
            System.out.printf("%d%s", array[i], separador);
            if (i == array.length-2) System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listaDeNumeros = new int[1];
        int contador = 0;
        int numero;
        do {
            System.out.print("Digite um número inteiro (999 para parar): ");
            numero = scanner.nextInt();
            
            if (numero != 999) {
                listaDeNumeros = adicionaArray(listaDeNumeros, numero, contador);
                contador++;
            }
        } while (numero != 999);

        System.out.println("------------------------------");
        System.out.println("Você digitou os números:");
        mostraArray(listaDeNumeros);
        System.out.println("------------------------------");
        scanner.close();
    }
}