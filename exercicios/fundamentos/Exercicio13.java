/*Leia:
*três valores representando lados de um triângulo
*
*Calcule e mostre:
*se cada lado é maior que zero
se a soma de dois lados é maior que o terceiro, para todos os casos */

package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        boolean ladosMaiorQue0 = (lado1 > 0 && lado2 > 0 && lado3 > 0);
        boolean possivelFormarUmTriangulo = (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2);


        System.out.printf("Todos os lados do triângulo são maiores que 0: %B%n", ladosMaiorQue0);
        System.out.printf("Os segmentos passados podem formar um triângulo: %B%n", possivelFormarUmTriangulo);
        scanner.close();

    }  
}