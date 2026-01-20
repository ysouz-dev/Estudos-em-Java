/* Objetivo: 
- Registrar transações financeiras, coletando valor, data e descrição.
Desafio:
- Pergunte quantas transações serão registradas.
- Para cada transação, solicite o valor (número decimal positivo), a data (em formato dd/MM/aaaa, validando o formato) e uma descrição (não vazia).
- Armazene esses dados em arrays separados.
- Ao final, exiba todas as transações com valor, data e descrição.*/

package exercicios.arrays;

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // lê e valida a quantidade de transações
        int quantidadeTransacoes;
        do {
            System.out.print("Digite a quantidade de transações: ");
            quantidadeTransacoes = scanner.nextInt();
            if (quantidadeTransacoes < 1) {
                System.out.println("Error: A quantidade de transações deve ser maior que 0");
            }
        } while (quantidadeTransacoes < 1);

        double[] valorTransacoes = new double[quantidadeTransacoes];
        String[] dataTransacoes = new String[quantidadeTransacoes];
        String[] descricaoTransacoes = new String[quantidadeTransacoes];
        
        for (int i = 0; i < quantidadeTransacoes; i++) {

            System.out.printf("-------- %d° TRANSAÇÃO --------%n", i+1);
            
            // lê e valida o valor da transação
            double valor;
            do {
                System.out.print("Valor da transação: ");
                valor = scanner.nextDouble();
                scanner.nextLine();
                if (valor < 1.0) {
                    System.out.println("Error: O valor da transação deve ser maior que 0.");
                } else {
                    valorTransacoes[i] = valor;
                }
            } while (valor < 1.0);
            

            // lê e valida a data da transação
            String data;
            boolean dataValida = false;
            do {

                System.out.print("Data da transação ex: (01/01/1111): ");
                data = scanner.nextLine().strip();
                
                // verifica se a data possui 10 caracteres
                if (data.length() != 10) {
                    System.out.println("Error: O formato da data deve ser dd/mm/aaaa.");
                
                    
                } else {
                    // verifica se cada caracter da data é um dígito ou uma barra ("/") dependendo da posição
                    for (int d = 0; d < data.length(); d++) {
                        if (Character.isDigit(data.charAt(d))) {
                            dataValida = true;
                        } else if ((d == 2 || d == 5) && data.charAt(d) == '/') {
                            dataValida = true;
                        } else {
                            dataValida = false;
                            break;
                        }
                    }  
                    // valida se a data passou com o formato certo
                    if (!dataValida) {
                        System.out.println("Error: O formato da data deve ser dd/mm/aaaa");
                        continue;
                    }
                    
                    // loop para verificar se o dia, mês e ano são válidos
                    int contadorDeVoltas = 0;
                    int tamanhoInicial = 0;
                    int tamanhoFinal = 0;
                    while (true) {
                        // conta quantos índices até a primeira barra (/)
                        for (int k = tamanhoInicial; k < data.length(); k++) {
                            if (!Character.isDigit(data.charAt(k)) || k == 9) {
                                if (k == 9){
                                    tamanhoFinal = k+1;
                                } else {
                                    tamanhoFinal = k;
                                }
                                break;
                            }
                        }
                        // cria uma variavel inteira com os números anteriores a barra (/)
                        int parteDaData = Integer.parseInt(data.substring(tamanhoInicial, tamanhoFinal));

                        // valida se o dia está entre 1 e 31 dias
                        if (contadorDeVoltas == 0) {
                            if (parteDaData > 0 && parteDaData <= 31) {
                                dataValida = true;
                            } else {
                                System.out.println("Error: O dia da transação está inválido!");
                                dataValida = false;
                                break;
                            }

                        // valida se o mês está entre 1 e 12 meses
                        } else if (contadorDeVoltas == 1) {
                            if (parteDaData > 0 && parteDaData <= 12) {
                                dataValida = true;
                            } else {
                                System.out.println("Error: O mês da transação está inválido!");
                                dataValida = false;
                                break;
                            }

                        // valida se o ano está entre 1800 e o ano atual do sistema operacional
                        } else if (contadorDeVoltas == 2) {
                            int anoAtual = java.time.Year.now().getValue();
                            if (parteDaData > 1800 && parteDaData <= anoAtual) {
                                dataValida = true;
                            } else {

                                // distingue o tipo de erro
                                String erro;
                                if (parteDaData <= 1800) {
                                    erro = "O ano da transação deve ser maior que 1800.";
                                } else {
                                    erro = "O ano da transação não pode ser superior ao ano atual.";
                                }
                                System.out.println("Error: " + erro);
                                dataValida = false;
                                break;
                            }
                        }
                        if (contadorDeVoltas != 2) {
                            contadorDeVoltas++;
                            tamanhoInicial = tamanhoFinal + 1;
                        } else {
                            dataTransacoes[i] = data;
                            break;
                        }
                    }
                }
            } while (!dataValida);
            
            // lê e valida a descrição da transação
            String descricao;
            do {
                System.out.print("Descrição da transação: ");
                descricao = scanner.nextLine().strip();

                if (descricao.equals("")) {
                    System.out.println("Error: A descrição da transação não pode estar vazia.");
                } else {
                    descricaoTransacoes[i] = descricao;
                }
            } while (descricao.equals(""));
        }

        // saída
        System.out.println("------------------------------");
        System.out.println("------ TODAS TRANSAÇÕES ------");
        for (int t = 0; t < quantidadeTransacoes; t++) {
            System.out.printf("%d. Transação %nValor: R$ %.2f %nData: %s %nDescrição: %s%n", 
                                t+1, valorTransacoes[t], dataTransacoes[t], descricaoTransacoes[t]);
            System.out.println("--------------------");
        }
        System.out.println("------------------------------");
        scanner.close();
    }
}