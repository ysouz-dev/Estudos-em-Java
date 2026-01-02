/* Leia uma nota (0 a 10).
Se inválida, repita.
Depois pergunte: “Deseja inserir outra nota? (s/n)”
Repita tudo conforme a resposta. */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "s";
        
        do {
            while (true) {
                System.out.print("Digite sua nota: ");
                double nota = scanner.nextDouble();

                if (nota < 0.0 || nota > 10.0) {
                    System.out.println("Error: A nota deve estar entre 0 e 10");
                } else {
                    break;
                }
            }

            System.out.print("Deseja inserir outra nota (s/n): ");
            resposta = scanner.next();
            resposta = resposta.toLowerCase();
        } while (resposta.equals("s"));
        scanner.close();
    }
}