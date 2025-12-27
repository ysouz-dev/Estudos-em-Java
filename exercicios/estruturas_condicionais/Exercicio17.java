/* Leia a idade de uma pessoa.
Mostre se ela é:
"Maior de idade"
"Menor de idade" */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nascimento, anoAtual;

        System.out.print("Digite seu ano de nascimento: ");
        nascimento = scanner.nextInt();

        anoAtual = java.time.Year.now().getValue();
        String maioridade;
        
        if (anoAtual - nascimento >= 18) {
            maioridade = "Maior de idade";
        } else {
            maioridade = "Menor de idade";
        }

        System.out.printf("A sua idade é de %d anos e você é %s", anoAtual - nascimento, maioridade);
        scanner.close();

        
    }
}