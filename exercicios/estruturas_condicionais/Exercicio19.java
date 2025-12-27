/* Leia um número inteiro.
Verifique se ele está entre 10 e 20 (inclusive).
Mostre:
"Dentro do intervalo"
"Fora do intervalo" */


package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        String intervalo;

        if (numero >= 10 && numero <= 20) {
            intervalo = "dentro do intervalo";
        } else {
            intervalo = "fora do intervalo";
        }
        
        System.out.printf("O número digitado está %s", intervalo);
        scanner.close();
    }
}