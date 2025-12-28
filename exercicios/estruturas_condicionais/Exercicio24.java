/* Leia:
salário, porcentagem de desconto, valor de bônus, calcule o salário final.

Se o salário final for:
maior que 3000 → "Salário alto"
entre 2000 e 3000 → "Salário médio"
menor que 2000 → "Salário baixo" */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioInicial, valorBonus, salarioFinal;

        System.out.print("Qual o valor do seu salário R$: ");
        salarioInicial = scanner.nextDouble();
        
        System.out.print("Qual a porcentagem de desconto do seu salário: ");
        int porcentagemDesconto = scanner.nextInt();
        
        System.out.print("Qual valor do seu bônus R$: ");
        valorBonus = scanner.nextDouble();

        salarioFinal = salarioInicial - (porcentagemDesconto / 100.0 * salarioInicial) + valorBonus;
        String tipoDeSalario;


        if (salarioFinal < 2000) {
            tipoDeSalario = "Salário baixo";
        } else if (salarioFinal < 3000) {
            tipoDeSalario = "Salário médio";
        } else {
            tipoDeSalario = "Salário alto";
        }


        System.out.printf("=========================%n"+
                        "Informações: %nSalário: R$ %.2f %nDesconto: %d%% %nBônus: R$ %.2f%n" +
                        "===========================%n" +
                        "Salario final: R$ %.2f %n(%s)%n", salarioInicial, porcentagemDesconto, valorBonus, salarioFinal, tipoDeSalario);
        scanner.close();
    
    
    }
}