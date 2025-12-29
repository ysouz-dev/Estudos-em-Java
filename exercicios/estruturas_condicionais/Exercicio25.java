/* Um sistema recebe:
um código inteiro (1 a 5)
um valor numérico positivo

 Regras:
código 1 → operação A
código 2 → operação B
código 3 → operação C
código 4 → operação D
código 5 → operação especial

 Regra especial:
Se o código for 5 e o valor for menor que 100, exiba "Operação não permitida"
Caso contrário, execute normalmente */


package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um código de 1 a 5: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite um número inteiro: ");
        int valor = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Executando operação A...");
                break;
            
            case 2:
                System.out.println("Executando operação B...");
                break;
                
            case 3:
                System.out.println("Executando operação C...");
                break;

            case 4:
                System.out.println("Executando operação D...");
                break;

            case 5:
                if (valor < 100) {
                    System.out.println("Operação não permitida.");
                } else {
                    System.out.println("Executando operação especial...");
                }
            default:
                System.out.println("Código Inválido!");
        }
        scanner.close(); 
    }
}