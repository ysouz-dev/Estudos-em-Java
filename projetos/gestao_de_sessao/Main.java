package projetos.gestao_de_sessao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // looping de validação da senha Senha: admin123
        String senhaDeAcesso;
        int tentativas = 3;

        while (true) {
            tentativas--;

            System.out.println("==============================");
            System.out.print("Digite a senha de acesso: ");
            senhaDeAcesso = scanner.nextLine();

            if (!senhaDeAcesso.equals("admin123")) {

                if (tentativas == 0) {
                    System.out.println("==============================");
                    System.out.println("Limite de tentativas excedido! Tente novamente mais tarde.\n");
                    break;
                }

                System.out.println("==============================");
                System.out.printf("Senha incorreta! você tem %d tentativa(s).%n", tentativas);
            } else {
                System.out.println("==============================");
                System.out.println("Acesso Liberado!");
                System.out.println("==============================");
                break;
            }

        }

        // contadores
        int operacoesValidas = 0, operacoesTotal = 0, operacoesInvalidas = 0, somaOperacoesValidas = 0, maiorValor = 0,
                menorValor = 0;

        // looping principal do menu
        while (senhaDeAcesso.equals("admin123")) {
            System.out.println("======= MENU PRINCIPAL =======");
            System.out.println("[ 1 ] Mostrar status da sessão \n[ 2 ] Registrar operação" +
                    "\n[ 3 ] Exibir relatório \n[ 4 ] Encerrar sessão");
            System.out.println("==============================");

            // validação da opção escolhida no menu
            int escolha;
            while (true) {
                System.out.print("Digite a opção desejada: ");
                escolha = scanner.nextInt();

                if (escolha < 1 || escolha > 4) {
                    System.out.printf("Error: %d não é uma opção válida, tente novamente.%n", escolha);
                    continue;
                }
                break;
            }

            switch (escolha) {

                // mostra status da sessão
                case 1:
                    System.out.println("====== STATUS DA SESSÃO ======");
                    System.out.printf("Sessão: Ativa%n" +
                            "Operações registradas: %d%n" +
                            "Operações válidas: %d%n" +
                            "Operações inválidas: %d%n", operacoesTotal, operacoesValidas, operacoesInvalidas);
                    System.out.println("==============================");
                    break;

                // registra operacao
                case 2:
                    System.out.println("========= REGISTRO ===========");
                    while (true) {
                        System.out.print("Digite o valor da operação: ");
                        int valor = scanner.nextInt();

                        // verifica se o valor é válido
                        if (valor > 0) {

                            // verifica se não há nenhum valor maior ou menor
                            if (operacoesValidas == 0) {
                                maiorValor = valor;
                                menorValor = valor;

                                // verifica valor atual com maior valor
                            } else if (valor > maiorValor) {
                                maiorValor = valor;

                                // verifica valor atual com menor valor
                            } else if (valor < menorValor) {
                                menorValor = valor;
                            }
                            somaOperacoesValidas += valor;
                            operacoesValidas++;
                            operacoesTotal++;
                            System.out.println("Operação registrada!");
                            break;

                        } else {
                            System.out.println("Error: Digite um valor válido.");
                            operacoesInvalidas++;
                            operacoesTotal++;
                        }
                    }
                    System.out.println("==============================");
                    break;

                // mostra relatório
                case 3:
                    System.out.println("=========  RELATÓRIO =========");
                    System.out.printf("Total de operações: %d%n" +
                            "Operações válidas: %d%n" +
                            "Operações inválidas: %d%n" +
                            "Soma dos valores: %d%n", operacoesTotal, operacoesValidas, operacoesInvalidas,
                            somaOperacoesValidas);

                    // verifica se existem operações validas para tirar média
                    if (operacoesValidas > 0) {
                        double media = somaOperacoesValidas / (double) operacoesValidas;
                        System.out.printf("Media: %.1f%n", media);
                    }

                    System.out.printf("Maior valor registrado: %d%n" +
                            "Menor valor registrado: %d%n", maiorValor, menorValor);

                    System.out.println("==============================");
                    break;

                // encerra a sessão
                case 4:
                    System.out.println("=======SESSÃO ENCERRADA=======");
                    System.out.println("Até a proxima!");
                    break;
            }

            if (escolha == 4) {
                scanner.close();
                break;
            }
        }
    }
}