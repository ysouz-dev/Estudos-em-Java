/* Leia números até que o usuário digite dois números iguais seguidos. */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAnterior, numeroAtual=0, somaTotal=0;

        while (true) {

            numeroAnterior = numeroAtual;

            do {
                System.out.print("Digite um número: ");
                numeroAtual = scanner.nextInt();
            
                if (numeroAtual <= 0) {
                    System.out.println("Error: o número precisa ser maior que 0.");
                }

            } while (numeroAtual <= 0);

            if (numeroAtual == numeroAnterior) {
                System.out.println("Número iguais detectados!");
                break;
            }

            somaTotal += numeroAtual;
        }

        System.out.printf("Soma dos números válidos digitados = %d", somaTotal);
        scanner.close();
    }
}