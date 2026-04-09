package projetos.gerenciador_de_barbearia.controller;

import projetos.gerenciador_de_barbearia.util.*;
import projetos.gerenciador_de_barbearia.service.SistemaBarbeariaImpl;
import projetos.gerenciador_de_barbearia.model.Pessoa.Sexo;
import projetos.gerenciador_de_barbearia.model.ClienteDiario;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Menu {
    private Scanner scanner;
    private SistemaBarbeariaImpl sistema;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.sistema = new SistemaBarbeariaImpl();
    }

    public int MenuPrincipal() {
        Formatador.linha();
        Formatador.titulo("Barbearia YS");
        Formatador.linha();
        System.out.println("[ 1 ] Cadastrar Cliente");
        System.out.println("[ 2 ] Listar Clientes");
        System.out.println("[ 0 ] Encerrar Sistema");

        Formatador.linha();

        int escolha = Integer.MIN_VALUE;
        do {
            try {
                System.out.print("Digite um número da opção: ");
                escolha = this.scanner.nextInt();
                this.scanner.nextLine();
                if (escolha < 0 || escolha > 2) {
                    System.out.printf("Erro: %d não é uma opção válida!%n", escolha);
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número das opções!");
                this.scanner.nextLine();
            }
            Formatador.linha();
        } while (escolha < 0 || escolha > 2);
        return escolha;
    }

    public void cadastrarCliente() {
        Formatador.tituloDinamico("Cadastro Cliente", 6);

        // leitura e validacao de nome
        String nome;
        while (true) {
            try {
                System.out.print("Nome: ");
                nome = this.scanner.nextLine();
                Validador.validaNome(nome);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // leitura e validacao de idade
        int idade;
        while (true) {
            try {
                System.out.print("Idade: ");
                idade = this.scanner.nextInt();
                Validador.validaIdade(idade);
                this.scanner.nextLine();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número para a idade.");
                this.scanner.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // leitura e validacao de cpf
        String cpf;
        while (true) {
            try {
                System.out.print("Cpf: ");
                cpf = this.scanner.nextLine();
                Validador.validaCPF(cpf);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // leitura e validacao de sexo
        Sexo sexo = Sexo.NAO_INFORMADO;
        while (true) {
            try {
                System.out.print("Sexo: ");
                sexo = sexo.toSexo(this.scanner.nextLine());
                Sexo.isSexo(sexo);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // tenta cadastrar o cliente no sistema
        try {
            this.sistema.cadastrarCliente(new ClienteDiario(nome, idade, cpf, sexo));
            System.out.println("Cliente cadastrado com sucesso!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        Formatador.linha();
    }

    public void listarClientes() {
        this.sistema.listarClientes();
    }

    public void encerrarSistema() {
        System.out.println("Sistema encerrado. Volte sempre!");
        this.scanner.close();
    }
}
