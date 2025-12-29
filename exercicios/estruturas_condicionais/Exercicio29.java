/* Entrada:
um tipo de operação (1, 2 ou 3)
dois valores numéricos

 Regras:
operação 1 → só executa se os dois valores forem positivos
operação 2 → executa se pelo menos um valor for positivo
operação 3 → executa apenas se os dois forem diferentes

Se a operação for inválida → "Operação inexistente" */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tipoOperacao, numero1, numero2;
        
        System.out.print("Tipo de operação (1, 2 ou 3): ");
        tipoOperacao = scanner.nextInt();

        if (tipoOperacao > 0 && tipoOperacao < 4) {
            System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextInt();
            
            switch (tipoOperacao) {
                case 1:
                    if (numero1 > 0 && numero2 > 0) {
                        System.out.println("Executando operação 1...");
                    } else {
                        System.out.println("Operação 1 não pode ser executada. (Os dois valores precisam ser positivos)");
                    }
                    break;

                case 2:
                    if (numero1 > 0 || numero2 > 0) {
                        System.out.println("Executando operação 2...");
                    } else {
                        System.out.println("Operação 2 não pode ser executada. (Pelo menos 1 número tem que ser positivo)");
                    }
                    break;

                case 3:
                    if (numero1 != numero2) {
                        System.out.println("Executando operação 3...");
                    } else {
                        System.out.println("Operação 3 não pode ser executada. (Os números precisam ser diferentes)");
                    }
                    break;
            }
        
        } else {
            System.out.println("Error: Operação inexistente!");
        }

        scanner.close();
    }
}