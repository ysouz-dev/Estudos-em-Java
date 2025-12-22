/*Leia:
* idade
* nota final
* presença (em porcentagem)
*
*Calcule e mostre:
se a pessoa:
* é maior ou igual a 18
* tem nota maior ou igual a 7
* tem presença maior ou igual a 75
*Depois, calcule uma única variável booleana que represente:
“A pessoa atende todos os critérios” */

package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.print("Sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Sua nota final: ");
        double notaFinal = scanner.nextDouble();
        
        System.out.print("Sua presença (em porcentagem): ");
        int presenca = scanner.nextInt();

        boolean idadeMaior18 = (idade >= 18);
        boolean notaMaior7 = (notaFinal >= 7.0);
        boolean presencaMaior75 = (presenca >= 75);

        boolean todosOsCriterios = (idadeMaior18 && notaMaior7 && presencaMaior75);

        System.out.printf("A idade de %s é maior ou igual a 18: %b%n" +
                            "%s tem nota final maior ou igual a 7.0: %b%n" +
                            "%s tem presença maior que 75%%: %b%n" +
                            "%s atende todos os critérios: %b%n",
                            nome, idadeMaior18, nome, notaMaior7, nome, presencaMaior75, nome, todosOsCriterios);
        
        scanner.close();
    }
}