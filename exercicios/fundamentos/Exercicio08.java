package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite sua data de nascimento");

        System.out.print("Dia: ");
        int dia = scanner.nextInt();

        System.out.print("Mês(1/2/3): ");
        int mes = scanner.nextInt();

        System.out.print("Ano: ");
        int anoDeNascimento = scanner.nextInt();

        int anoAtual = java.time.Year.now().getValue();

        int idade = anoAtual - anoDeNascimento;

        int tempoDeVida = idade * 365 + mes * 30 + dia;

        System.out.printf("Com %d anos, você possui aproximadamente %d dias de vida.", idade, tempoDeVida);
        scanner.close();

    }
}