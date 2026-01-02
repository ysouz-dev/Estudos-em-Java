/* Leia um número inteiro positivo.
Enquanto o usuário digitar valor inválido, continue pedindo.
Só encerre quando o valor for válido e mostre-o. */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero < 0) {
                System.out.println("Error: O número precisa ser positivo.");
                continue;
            }
            break;
        
        }

        System.out.println("Você digitou o número: " + numero);
        scanner.close();
    }
}