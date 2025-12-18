package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário base: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        int desconto = scanner.nextInt();

        System.out.print("Digite o valor do bônus: ");
        double bonus = scanner.nextDouble();

        double salarioFinal = salario - desconto / 100.0 * salario + bonus;

        System.out.printf("Um salário de R$ %.2f subtraindo %d%% de desconto" + 
                            " e adicionando R$ %.2f de bônus, seu salário final fica %.2f%n",
                            salario, desconto, bonus, salarioFinal);
        scanner.close();

    }
}