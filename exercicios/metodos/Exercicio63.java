/* Crie uma calculadora simples com métodos separados.*/

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio63 {

    // metodo soma
    public static double soma(double x, double y) {
        return x + y;
    }

    // metodo subtracao
    public static double subtracao(double x, double y) {
        return x - y;
    }

    // metodo multiplicacao
    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    //metodo divisao
    public static double divisao(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // menu aonde o usuário escolhe a operação desejada
        System.out.println("------------------------------");
        System.out.println("      Calculadora simples");
        System.out.println("------------------------------");
        System.out.println("[ 1 ] Somar \n[ 2 ] Subtração \n[ 3 ] Multiplicação \n[ 4 ] Divisão");
        System.out.println("------------------------------");

        // lê e valida a escolha
        int escolha;
        do {
            System.out.print("Qual opção desejada: ");
            escolha = scanner.nextInt();

            if (escolha < 1 || escolha > 4) {
                System.out.printf("Error: %d não é uma opção, tente novamente.%n", escolha);
            }
        } while (escolha < 1 || escolha > 4);

        System.out.println("------------------------------");

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        // decide o método utilizado de acordo com a escolha do usuário
        switch (escolha) {
            case 1:
                System.out.println("----------- SOMA ------------");
                double resultadoSoma = soma(n1, n2);
                System.out.printf("A soma de %.2f + %.2f = %.2f%n", n1, n2, resultadoSoma);
                break;

            case 2:
                System.out.println("---------- SUBTRAÇÃO ----------");
                double resultadoSub = subtracao(n1, n2);
                System.out.printf("A subtração de %.2f - %.2f = %.2f%n", n1, n2, resultadoSub);
                break;

            case 3:
                System.out.println("-------- MULTIPLICAÇÃO --------");
                double resultadoMult = multiplicacao(n1, n2);
                System.out.printf("A multiplicação de %.2f x %.2f = %.2f%n", n1, n2, resultadoMult);
                break;

            case 4:

                if (n2 == 0) {
                    System.out.println("Não é possivel fazer uma divisão por 0, tente novamente.");
                    break;
                }
                System.out.println("----------- DIVISÃO -----------");
                double resultadoDiv = divisao(n1, n2);
                System.out.printf("A divisão de %.2f / %.2f = %.2f%n", n1, n2, resultadoDiv);
                break;
        }
        System.out.println("------------------------------");
        scanner.close();
    }
}