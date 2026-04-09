package projetos.gerenciador_de_barbearia.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public int MenuPrincipal() {
        System.out.println("=============================");
        System.out.println("==       Barbearia YS      ==");
        System.out.println("=============================");
        System.out.println("[ 1 ] Cadastrar Cliente");

        System.out.println("=============================");

        int escolha = Integer.MIN_VALUE;
        do {
            try {
                System.out.print("Digite um número da opção: ");
                escolha = this.scanner.nextInt();
                if (escolha < 1 || escolha > 1) {
                    System.out.printf("Erro: %d não é uma opção válida!%n", escolha);
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número das opções!");
                this.scanner.nextLine();
            }
        } while (escolha < 1 || escolha > 1);
        return escolha;
    }
}
