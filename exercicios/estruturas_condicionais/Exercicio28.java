/* Entrada:
uma nota (0 a 10)
um código de avaliação (A, B ou C)

 Regras:
código A → aprovado se nota ≥ 7
código B → aprovado se nota ≥ 8
código C → aprovado se nota ≥ 6

Se a nota estiver fora de 0 a 10 → "Nota inválida" */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota (0 a 10): ");
        int nota = scanner.nextInt();

        if (nota >= 0 && nota <= 10) {
            System.out.print("Código de avaliação (A, B ou C): ");
            String codigoAvaliacao = scanner.next();
            
            
            switch (codigoAvaliacao) {
                case "A","a":
                    System.out.printf("Sua nota: %d pts%n", nota);
                    if (nota >= 7) {
                        System.out.println("Situação: APROVADO");
                    } else {
                        System.out.println("Situação: REPROVADO");
                    }
                    break;

                case "B","b":
                    System.out.printf("Sua nota: %d pts%n", nota);
                    if (nota >= 8) {
                        System.out.println("Situação: APROVADO");
                    } else {
                        System.out.println("Situação: REPROVADO");
                    }
                    break;

                case "C", "c":
                    System.out.printf("Sua nota: %d pts%n", nota);
                    if (nota >= 6) {
                        System.out.println("Situação: APROVADO");
                    } else {
                        System.out.println("Situação: REPROVADO");
                    }
                    break;
                
                default:
                    System.out.println("Código de avaliação inválido.");
            }
        } else {
            System.out.println("Error: Nota inválida! (Deve ser entre 0 e 10).");
        }

        scanner.close();

    }
}