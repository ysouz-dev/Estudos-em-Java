/* Simule um caixa eletrônico:
valores válidos > 0
mostre total sacado
conte operações inválidas */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // credenciais fictícias para fins de estudo

        String login = "usuario";               // login de acesso da conta
        String password = "usuario123";         // senha de acesso da conta
        int pass = 1234;                        // senha de 4 dígitos (Transação)
        int tentativas = 3;                     // total de tentativas de acesso a conta
        boolean acesso = false;                 // acesso a conta
        double saldoDisponivel = 0.0;           // saldo bancário

        System.out.println("----- Caixa Eletrônico 24hrs -----");
        do {
            tentativas--;

            System.out.print("login: ");
            String loginAcesso = scanner.nextLine();
            loginAcesso = loginAcesso.strip().toLowerCase();

            System.out.print("Senha: ");
            String passwordAcesso = scanner.nextLine();

            if (loginAcesso.equals(login) && passwordAcesso.equals(password)) {
                acesso = true;
            } else {
                if (tentativas > 0) {
                    System.out.println("--------------------------------");
                    System.out.printf("login ou senha inválidos. Você tem mais %d tentativas.%n", tentativas);
                    System.out.println("--------------------------------");
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Você excedeu o limite de tentativas! Tente novamente mais tarde.");
                    break;
                }
            }


            if (acesso) {
                System.out.println("--------------------------------");
                System.out.printf("Seja bem vindo %s!%n", loginAcesso.toLowerCase());
            }

        } while (!acesso);

        System.out.println("--------------------------------");


        int operacoesInvalidas = 0; 
        double totalSacado = 0;
        while (acesso) {
            System.out.println("-------- MENU PRINCIPAL --------");
            System.out.println("[ 1 ] Depositar \n[ 2 ] Sacar \n[ 3 ] Saldo disponivel \n[ 4 ] Sair da conta");
            System.out.println("--------------------------------");

            int escolha;
            while (true) {
                System.out.print("Qual opção desejada: ");
                escolha = scanner.nextInt();

                if (escolha < 1 || escolha > 4) {
                    System.out.printf("Error: Não existe opção %d, tente novamente.%n", escolha);
                    continue;
                }
                break;
            }

            switch (escolha) {
                case 1:
                    System.out.println("----------- DEPÓSITO -----------");
                    System.out.print("Qual valor deseja depositar? R$ ");
                    double valorDeposito = scanner.nextDouble();

                    if (valorDeposito > 0) {
                        saldoDisponivel += valorDeposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.printf("Não é possivel depositar R$ %.2f. Deposite um valor maior que 0.%n", valorDeposito);
                        operacoesInvalidas++;
                    }
                    break;

                case 2:
                    System.out.println("------------- SAQUE -------------");
                    System.out.print("Qual valor deseja sacar? R$ ");
                    double valorSaque = scanner.nextDouble();

                    if (valorSaque <= saldoDisponivel && valorSaque > 0) {

                        System.out.println("----------");
                        System.out.print("Digite sua senha de 4 dígitos: ");
                        int senhaTransacao = scanner.nextInt();

                        if (senhaTransacao != pass) {
                            System.out.println("Senha incorreta! tente novamente.");
                            break;
                        }

                        saldoDisponivel -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                        totalSacado += valorSaque;
                    } else {
                        String erro;

                        if (valorSaque <= 0) {
                            erro = "Error: Os saques precisam ser maiores que 0.";
                        } else {
                            erro = "Saldo insuficiente! Tente novamente.";
                        }
                        System.out.println(erro);
                        operacoesInvalidas++;
                    }
                    break;

                case 3:
                    System.out.println("------- SALDO DISPONÍVEL -------");
                    System.out.printf("Saldo: R$ %.2f%n", saldoDisponivel);
                    break;

                case 4:
                    System.out.println("------ ENCERRANDO SISTEMA ------");
                    System.out.println("Volte sempre!");
            }
            if (escolha == 4) {
                System.out.println("-------- RESUMO DO CAIXA --------");
                System.out.printf("Total sacado: R$ %.2f %nOperações inválidas: %d%n", totalSacado, operacoesInvalidas);
                break;
            }

        }
        scanner.close();
    }
}