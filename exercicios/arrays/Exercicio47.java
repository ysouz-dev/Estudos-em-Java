/* Leia 10 números e depois um número para “remover”.

Não pode criar outro array.
O número deve ser substituído por -1*/

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listaNumeros[] = new int[10];
        for (int i=0; i < listaNumeros.length; i++) {
            do {
                System.out.printf("Digite o %d° número: ", i+1);
                listaNumeros[i] = scanner.nextInt();

                if (listaNumeros[i] < 0) {
                    System.out.println("Error: O número não pode ser negativo.");
                } 
    
            } while (listaNumeros[i] < 0);
        }

        System.out.println("------------------------------");

        int numeroRemovido;
        do {
            System.out.print("Digite o número que deseja remover: ");
            numeroRemovido = scanner.nextInt();

            if (numeroRemovido < 0) {
                System.out.println("Error: O número não pode ser negativo.");
            }

        } while (numeroRemovido < 0);

        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] == numeroRemovido) {
                listaNumeros[i] = -1;
            }
        }
        
        System.out.println("------------------------------");

        System.out.println("--------- LISTA FINAL ---------");
        System.out.println(Arrays.toString(listaNumeros));
        scanner.close();
    }
}