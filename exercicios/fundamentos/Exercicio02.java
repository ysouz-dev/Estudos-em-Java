package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomePessoa = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idadePessoa = scanner.nextInt();

        System.out.printf("Olá %s, você tem %d anos.%n", nomePessoa, idadePessoa);
        scanner.close();
    }
}