/* criar um programa em Java que simula um validador de cadastro de usuário,
 usando métodos bem separados. */

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio73 {

    public static void menu(Scanner scanner) {
        System.out.println("===========================");
        System.out.println("||       Cadastro        ||");
        System.out.println("===========================");

        String nome;
        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine().strip().toUpperCase();
            if (!validaNome(nome)) {
                if (nome.isEmpty()) {
                    System.out.println("Error: O nome não pode estar vazio.");
                } else {
                    System.out.println("Error: O nome deve conter apenas caracteres alfabéticos.");
                }
            }
        } while (!validaNome(nome));

        int idade;
        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if (!validaIdade(idade)) {
                String erro = (idade < 18) ? "Você deve ser maior de idade para se cadastrar" : "A idade máxima permitida para cadastro é 65 anos";
                System.out.printf("Error: %s.%n", erro);
            }
        } while (!validaIdade(idade));

        double salario;
        do {
            System.out.print("Salário: ");
            salario = scanner.nextDouble();

            if (!validaSalario(salario)) {
                System.out.println("Error: O salário não pode ser R$ 0,00.");
            }
        } while (!validaSalario(salario));

        System.out.println("=================================");
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("=================================");
        System.out.printf("1. %nNome: %s %nIdade: %d anos %nSalário: R$ %.2f%n", nome, idade, salario);
        System.out.println("=================================");
    }

    public static boolean validaNome(String nome) {
        if (nome.isEmpty()) {
            return false;
        }

        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validaIdade(int idade) {
        return idade >= 18 && idade <= 65;
    }

    public static boolean validaSalario(double salario) {
        return salario > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        scanner.close();
    }
}