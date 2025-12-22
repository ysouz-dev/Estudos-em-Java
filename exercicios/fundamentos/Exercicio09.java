package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o cateto oposto: ");
        double catetoOposto = scanner.nextDouble();
        
        System.out.print("Digite o cateto adjacente: ");
        double catetoAdjacente = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2));

        System.out.printf("A hipotenusa vai medir %.2f metros%n", hipotenusa);
        scanner.close();

    }
}