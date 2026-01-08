/* Leia 15 números inteiros e coloque eles em ordem.

Depois:
- Leia um número
- Procure esse numero na lista  

Informe:
- Se existe
- Posição
- Se não existir, diga onde ele deveria ser inserido */

package exercicios.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.printf("Digite o %d° número: ", i+1);
                numeros[i] = scanner.nextInt();
                
                if (numeros[i] < 0) {
                    System.out.println("Error: O número não pode ser negativo.");
                }
            
            } while (numeros[i] < 0);
        }
        Arrays.sort(numeros);

        System.out.println("------------------------------");

        int numeroProcurado;
        do {
            System.out.print("Digite um número para procurar: ");
            numeroProcurado = scanner.nextInt();
            if (numeroProcurado < 0) {
                System.out.println("Error: O número não pode ser negativo.");
            }
        } while (numeroProcurado < 0);

        boolean existeNumeroProcurado = (Arrays.binarySearch(numeros, numeroProcurado) >= 0) ? true : false;

        System.out.println("-----------------------------");

        System.out.printf("Número: %d %nFoi encontrado: %b%n", numeroProcurado, existeNumeroProcurado);
        if (existeNumeroProcurado) {
            System.out.printf("Posição: %d%n", Arrays.binarySearch(numeros, numeroProcurado));
        } else {
            System.out.printf("Existiria na posição: %d%n", -Arrays.binarySearch(numeros, numeroProcurado) - 1);

        }

        System.out.println("-----------------------------");
        scanner.close();
    }
}