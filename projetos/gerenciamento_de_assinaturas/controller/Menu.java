package projetos.gerenciamento_de_assinaturas.controller;

import java.util.Scanner;
import java.util.ArrayList;
import projetos.gerenciamento_de_assinaturas.model.*;
import projetos.gerenciamento_de_assinaturas.service.Sistema;

public class Menu {
    private Scanner scanner;
    private Sistema sistema;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.sistema = new Sistema();
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
            this.scanner.nextLine();
            if (opcao < 1 || opcao > 8) {
                System.out.println("Erro: %d não é uma opção válida.".formatted(opcao));
            }
        } while (opcao < 1 || opcao > 8);
        return opcao;
    }

    public void cadastrarCliente() {
        System.out.println("===== Cadastro Cliente =====");
        System.out.print("Nome: ");
        String nome = this.scanner.nextLine();
        System.out.print("Email: ");
        String email = this.scanner.nextLine();

        sistema.cadastrarCliente(new Cliente(nome, email));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void cadastrarPlano() {
        System.out.println("===== Cadastro Plano =====");
        System.out.print("Nome plano: ");
        String nomePlano = this.scanner.nextLine();

        System.out.print("Valor mensalidade: R$ ");
        double valor = this.scanner.nextDouble();

        System.out.print("Limite de telas: ");
        int limite = this.scanner.nextInt();

        sistema.cadastrarPlano(new Plano(nomePlano, valor, limite));
        System.out.println("Plano cadastrado com sucesso!");
    }

    public void criarAssinatura() {
        if (this.sistema.getCliente().size() > 0 && this.sistema.getPlano().size() > 0) {
            System.out.println("===== Assinatura =====");
            int indexEmail;
            do {
                System.out.print("Email de quem deseja cadastrar: ");
                String email = this.scanner.nextLine();
                indexEmail = findEmail(this.sistema.getCliente(), email);

                if (indexEmail < 0) {
                    System.out.println("Email não encontrado, tente novamente.");
                }
            } while (indexEmail < 0);

            listaDePlanos();
            System.out.println("==============");
            int opcaoPlano;
            do {
                System.out.print("Qual plano deseja assinar: ");
                opcaoPlano = this.scanner.nextInt();

                if (opcaoPlano < 1 || opcaoPlano > this.sistema.getPlano().size()) {
                    System.out.println("Erro: %d não é uma opção válida.".formatted(opcaoPlano));
                }
            } while (opcaoPlano < 1 || opcaoPlano > this.sistema.getPlano().size());

            this.sistema.criarAssinatura(
                    new Assinatura(this.sistema.getCliente().get(indexEmail),
                            this.sistema.getPlano().get(opcaoPlano - 1)));
            System.out.println("Assinatura cadastrada com sucesso!");
        } else {
            String erro = "O sistema não possui nenhum cliente cadastrado para criar assinatura";
            if (this.sistema.getPlano().size() == 0) {
                erro = "O sistema não possui nenhum plano cadastrado para criar assinatura";
            }
            System.out.println("============================");
            System.out.println(erro);
        }
    }

    public void cancelarAssinatura() {
        if (this.sistema.getAssinaturas().size() > 0) {
            System.out.println("===== Cancelar Assinatura =====");
            int indexAssinatura = -1;
            do {
                System.out.print("Digite seu email: ");
                String email = this.scanner.nextLine();
                indexAssinatura = findAssinatura(this.sistema.getAssinaturas(), email);
                if (indexAssinatura < 0) {
                    System.out.println("Não foi encontrada nenhuma assinatura com esse email, tente novamente.");
                }
            } while (indexAssinatura < 0);

            this.sistema.getAssinaturas().get(indexAssinatura).cancelarAssinatura();
            System.out.println("Assinatura cancelada.");
        } else {
            System.out.println("Não foi encontrada nenhuma assinatura no sistema.");
        }
    }

    public void reativarAssinatura() {
        if (this.sistema.getAssinaturas().size() > 0) {
            System.out.println("===== Reativar Assinatura =====");
            int indexAssinatura = -1;
            do {
                System.out.print("Digite seu email: ");
                String email = this.scanner.nextLine();
                indexAssinatura = findAssinatura(this.sistema.getAssinaturas(), email);
                if (indexAssinatura < 0) {
                    System.out.println("Não foi encontrada nenhuma assinatura com esse email");
                }
            } while (indexAssinatura < 0);

            this.sistema.getAssinaturas().get(indexAssinatura).reativarAssinatura();
            System.out.println("Assinatura reativada!");
        } else {
            System.out.println("Não foi encontrada nenhuma assinatura no sistema.");
        }
    }

    public void listarAssinaturasAtivas() {
        if (this.sistema.getAssinaturas().size() > 0) {
            System.out.println("===== Assinaturas Ativas =====");
            int contador = 1;
            for (Assinatura ass : this.sistema.getAssinaturas()) {
                if (ass.getStatus()) {
                    System.out.println(contador + ".");
                    System.out.println("Nome do cliente: " + ass.getCliente().getNome());
                    System.out.println("Plano: " + ass.getPlano().getNomePlano());
                    System.out.println("Status: " + ass.getStatus());
                    System.out.println("Data da assinatura: " + ass.getData());
                    System.out.println("==================================");
                    contador++;
                }
            }
        } else {
            System.out.println("Não foi encontrada nenhuma assinatura no sistema.");
        }
    }

    private void listaDePlanos() {
        for (int i = 0; i < this.sistema.getPlano().size(); i++) {
            System.out.println("[%d] %s - R$ %.2f".formatted(i + 1, this.sistema.getPlano().get(i).getNomePlano(),
                    this.sistema.getPlano().get(i).getValorMensalidade()));
        }
    }

    private static int findEmail(ArrayList<Cliente> lista, String email) {
        for (int i = 0; i < lista.size(); i++) {
            if (email.strip().toUpperCase().equals(lista.get(i).getEmail())) {
                return i;
            }
        }
        return -1;
    }

    private static int findAssinatura(ArrayList<Assinatura> lista, String email) {
        for (int i = 0; i < lista.size(); i++) {
            if (email.strip().toUpperCase().equals(lista.get(i).getCliente().getEmail())) {
                return i;
            }
        }
        return -1;
    }
}
