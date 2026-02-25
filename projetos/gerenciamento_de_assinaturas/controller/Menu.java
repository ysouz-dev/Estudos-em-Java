package projetos.gerenciamento_de_assinaturas.controller;

import java.util.Scanner;
import projetos.gerenciamento_de_assinaturas.model.*;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public int iniciar() {
        System.out.println("============================");
        System.out.println("==       Assinaturas      ==");
        System.out.println("============================");
        System.out.println("[ 1 ] Cadastrar cliente");
        System.out.println("[ 2 ] Cadastrar plano");
        System.out.println("[ 3 ] Criar assinatura");
        System.out.println("[ 4 ] Cancelar assinatura");
        System.out.println("[ 5 ] Reativar assinatura");
        System.out.println("[ 6 ] Listar assinaturas ativas");
        System.out.println("[ 7 ] Calcular faturamento mensal");
        System.out.println("[ 8 ] Encerrar");
        System.out.println("============================");
        int opcao;
        do {
            System.out.print("Digite a opção desejada: ");
            opcao = this.scanner.nextInt();
            if (opcao < 1 || opcao > 8) {
                System.out.println("Erro: %d não é uma opção válida.".formatted(opcao));
            }
        } while (opcao < 1 || opcao > 8);
        return opcao;
    }
}
