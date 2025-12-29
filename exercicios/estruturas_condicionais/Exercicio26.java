/* Entrada:
um nível de acesso (1, 2 ou 3)
uma idade

 Regras:
nível 1 → acesso básico
nível 2 → acesso intermediário
nível 3 → acesso total

 Restrições:
nível 3 só é permitido se idade ≥ 21
nível 2 não é permitido se idade < 16 */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nivel de acesso (1, 2 ou 3): ");
        int nivelDeAcesso = scanner.nextInt();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        String erro;


        if ((nivelDeAcesso > 0 && nivelDeAcesso < 4) && idade > 0) {
            switch (nivelDeAcesso) {
                case 1:
                    System.out.println("Acesso Básico Liberado!");
                    break;

                case 2:
                    if (idade >= 16) {
                        System.out.println("Acesso Intermediário Liberado!");
                    } else {
                        System.out.println("Acesso Intermediário Negado! (Idade abaixo de 16 anos.)");
                    }
                    break;

                case 3:
                    if (idade >= 21) {
                        System.out.println("Acesso Total Liberado!");
                    } else {
                        System.out.println("Acesso Total Negado! (Idade menor que 21 anos.)");
                    }
            }
        } else {
            if (nivelDeAcesso < 1 || nivelDeAcesso > 3) {
                erro = "Error: Nivel de acesso inválido!";
            } else {
                erro = "Error: Idade inválida!";
            }
            System.out.println(erro);
        }
        
        scanner.close();
    }
}