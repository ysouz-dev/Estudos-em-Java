/*Leia:
* uma nota (decimal)
*
* Calcule e mostre:
* se a nota é maior ou igual a 7
se a nota está entre 5 e 10  */

package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();

        boolean situacao1 = (nota >= 7.0) ? true : false;
        boolean situacao2 = (nota > 5.0 && nota < 10.0) ? true : false;

        System.out.printf("A sua nota de %.1f pts é maior ou igual a 7.0 pts: %b%n", nota, situacao1);
        System.out.printf("A sua nota de %.1f pts está entre 5.0 e 10.0 pts: %b%n", nota, situacao2);
        scanner.close();


    }
}