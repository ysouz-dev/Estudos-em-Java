/* Leia 12 números e diga se o array é:
- totalmente crescente
- totalmente decrescente
- nem um, nem outro */

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listaNumeros[] = new int[12];
        for (int i = 0; i < listaNumeros.length; i++) {
            do {
                System.out.printf("Digite o %d° número: ", i + 1);
                listaNumeros[i] = scanner.nextInt();

                if (listaNumeros[i] < 0) {
                    System.out.println("Error: O número não pode ser negativo.");
                }
            } while (listaNumeros[i] < 0);
        }

        // verifica se é crescente
        int contagemCrescente = 0;
        if (listaNumeros[0] <= listaNumeros[1]) {
            for (int i = 0; i < listaNumeros.length; i++) {
                if (i < listaNumeros.length-1) {
                    if (listaNumeros[i] <= listaNumeros[i + 1]) {
                        contagemCrescente++;
                    }
                }
            }
        }

        // verifica se é decrescente
        int contagemDecrescente = 0;
        if (listaNumeros[0] >= listaNumeros[1]) {
            for (int i = 0; i < listaNumeros.length; i++) {
                if (i < listaNumeros.length-1) {
                    if (listaNumeros[i] >= listaNumeros[i + 1]) {
                        contagemDecrescente++;
                    }
                }
            }
        }

        // define o tipo da lista
        String tipo;
        if (contagemCrescente == listaNumeros.length-1) {
            tipo = "totalmente crescente";
        } else if (contagemDecrescente == listaNumeros.length-1) {
            tipo = "totalmente decrescente";
        } else {
            tipo = "nem crescente, nem decrescente";
        }

        // saída
        System.out.println("------------------------------");
        System.out.println(Arrays.toString(listaNumeros));
        System.out.println("------------------------------");
        System.out.printf("A array é %s.%n", tipo);
        scanner.close();
    }
}