package projetos.sistema_de_cadastro_e_analise;

import java.util.Scanner;

public class Main {

    public static int menu(Scanner scanner) {
        System.out.println("==============================");
        System.out.println("||    Sistema de Cadastro   ||");
        System.out.println("==============================");
        System.out.println("[ 1 ] Cadastrar pessoa\n" +
                "[ 2 ] Listar todas as pessoas\n" +
                "[ 3 ] Mostrar maiores de idade\n" +
                "[ 4 ] Mostrar média salarial\n" +
                "[ 5 ] Mostrar pessoa com maior salário\n" +
                "[ 6 ] Mostrar pessoa mais nova\n" +
                "[ 7 ] Sair");
        System.out.println("==============================");
        int escolha;
        do {
            System.out.print("Digite a opção desejada: ");
            escolha = scanner.nextInt();
            scanner.nextLine();
            if (escolha < 1 || escolha > 7) {
                System.out.printf("Error: %d não é uma opção válida. Tente novamente!%n", escolha);
            }
        } while (escolha < 1 || escolha > 7);
        System.out.println("==============================");
        return escolha;
    }

    public static Object[] cadastrarPessoa(Scanner scanner, String[] listaNomes, int[] listaIdades, char[] listaSexos,
            double[] listaSalarios) {
        String nome;
        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine().toUpperCase();
            if (!validaNome(nome)) {
                System.out.println("Error: O nome deve contem apenas caracteres alfabéticos.");
            }
        } while (!validaNome(nome));

        int idade;
        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            if (!validaIdade(idade)) {
                System.out.println("Error: A idade deve ser maior que 0.");
            }
        } while (!validaIdade(idade));

        char sexo;
        do {
            System.out.print("Sexo: ");
            String pergunta = scanner.next().strip().toUpperCase();
            sexo = pergunta.charAt(0);
            if (!validaSexo(sexo)) {
                System.out.println("Error: Sexo inválido! Digite somente F (Feminino) ou M (Masculino).");
            }
        } while (!validaSexo(sexo));

        double salario;
        do {
            System.out.print("Salário: R$ ");
            salario = scanner.nextDouble();
            if (!validaSalario(salario)) {
                System.out.println("Error: O salário não pode ser negativo.");
            }
        } while (!validaSalario(salario));

        Object[] listas = { adicionaAtributo(listaNomes, nome), adicionaAtributo(listaIdades, idade),
                adicionaAtributo(listaSexos, sexo), adicionaAtributo(listaSalarios, salario) };
        return listas;
    }

    public static void listarPessoas(String[] nomes, int[] idades, char[] sexos, double[] salarios) {
        if (nomes.length > 0) {
            for (int i = 0; i < nomes.length; i++) {
                System.out.printf("%d. %nNome: %s %nIdade: %d anos %nSexo: %c %nSalário: R$ %.2f%n",
                        i + 1, nomes[i], idades[i], sexos[i], salarios[i]);
                System.out.println("==============================");
            }
        } else {
            System.out.println("Nenhuma pessoa está cadastrada!");
        }
    }

    public static void listarMaiores(String[] nomes, int[] idades, char[] sexos, double[] salarios) {
        if (nomes.length > 0) {
            int contador = 1;
            for (int i = 0; i < nomes.length; i++) {
                if (idades[i] >= 18) {
                    System.out.printf("%d. %nNome: %s %nIdade: %d anos %nSexo: %c %nSalário: R$ %.2f%n",
                            contador, nomes[i], idades[i], sexos[i], salarios[i]);
                    System.out.println("==============================");
                    contador++;
                }
            }
        } else {
            System.out.println("Nenhuma pessoa está cadastrada!");
        }
    }

    public static double mediaSalarial(double[] salarios) {
        if (salarios.length > 0) {
            double somaTotal = 0;
            for (double salario : salarios) {
                somaTotal += salario;
            }
            return somaTotal / (double) salarios.length;
        } else {
            return 0;
        }
    }

    public static void maiorSalario(String[] nomes, double[] salarios) {
        if (nomes.length > 0) {
            double maiorSalario = 0;
            String nomeMaiorSalario = "";
            for (int i = 0; i < nomes.length; i++) {
                if (i == 0) {
                    maiorSalario = salarios[i];
                    nomeMaiorSalario = nomes[i];

                } else if (salarios[i] > maiorSalario) {
                    maiorSalario = salarios[i];
                    nomeMaiorSalario = nomes[i];
                }
            }
            System.out.printf("        %s%n         R$ %.2f%n", nomeMaiorSalario, maiorSalario);
        } else {
            System.out.printf("           <Empty>%n           R$ 0,00%n");
        }
    }

    public static void mostrarMaisNovo(String[] nomes, int[] idades) {

        if (nomes.length > 0) {
            int idadeMaisNova = 0;
            String nomeMaisNovo = "";
            for (int i = 0; i < nomes.length; i++) {
                if (i == 0) {
                    idadeMaisNova = idades[i];
                    nomeMaisNovo = nomes[i];
                } else if (idades[i] < idadeMaisNova) {
                    idadeMaisNova = idades[i];
                    nomeMaisNovo = nomes[i];
                }
            }
            System.out.printf("        %s%n        %d anos%n", nomeMaisNovo, idadeMaisNova);
        } else {
            System.out.printf("          <Empty>%n           0 anos%n");
        }
    }

    public static String[] adicionaAtributo(String[] arrayNome, String nomeAdicionado) {
        String[] novosNomes = new String[arrayNome.length + 1];
        for (int i = 0; i < arrayNome.length; i++) {
            novosNomes[i] = arrayNome[i];
        }
        novosNomes[arrayNome.length] = nomeAdicionado;
        return novosNomes;
    }

    public static int[] adicionaAtributo(int[] arrayIdade, int idadeAdicionada) {
        int[] novasIdades = new int[arrayIdade.length + 1];
        for (int i = 0; i < arrayIdade.length; i++) {
            novasIdades[i] = arrayIdade[i];
        }
        novasIdades[arrayIdade.length] = idadeAdicionada;
        return novasIdades;
    }

    public static char[] adicionaAtributo(char[] arraySexo, char sexoAdicionado) {
        char[] novoSexo = new char[arraySexo.length + 1];
        for (int i = 0; i < arraySexo.length; i++) {
            novoSexo[i] = arraySexo[i];
        }
        novoSexo[arraySexo.length] = sexoAdicionado;
        return novoSexo;
    }

    public static double[] adicionaAtributo(double[] arraySalario, double salarioAdicionado) {
        double[] novoSalario = new double[arraySalario.length + 1];
        for (int i = 0; i < arraySalario.length; i++) {
            novoSalario[i] = arraySalario[i];
        }
        novoSalario[arraySalario.length] = salarioAdicionado;
        return novoSalario;
    }

    public static boolean validaNome(String nome) {
        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validaIdade(int idade) {
        return idade > 0;
    }

    public static boolean validaSexo(char sexo) {
        final char[] SEXOS_PERMITIDOS = { 'M', 'F' };
        for (char sex : SEXOS_PERMITIDOS) {
            if (sexo == sex) {
                return true;
            }
        }
        return false;
    }

    public static boolean validaSalario(double salario) {
        return salario >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listaDeNomes = new String[0];
        int[] listaDeIdades = new int[0];
        char[] listaDeSexos = new char[0];
        double[] listaDeSalarios = new double[0];

        int escolha = 0;
        while (escolha != 7) {
            escolha = menu(scanner);
            switch (escolha) {
                case 1:
                    System.out.println("===========Cadastro===========");
                    Object[] novosAtributos = cadastrarPessoa(scanner, listaDeNomes, listaDeIdades, listaDeSexos,
                            listaDeSalarios);
                    listaDeNomes = (String[]) novosAtributos[0];
                    listaDeIdades = (int[]) novosAtributos[1];
                    listaDeSexos = (char[]) novosAtributos[2];
                    listaDeSalarios = (double[]) novosAtributos[3];
                    System.out.println("== Pessoa cadastrada com sucesso! ==");
                    break;
                case 2:
                    System.out.println("=======Lista de Pessoas=======");
                    listarPessoas(listaDeNomes, listaDeIdades, listaDeSexos, listaDeSalarios);
                    break;

                case 3:
                    System.out.println("=======Maiores de idade=======");
                    listarMaiores(listaDeNomes, listaDeIdades, listaDeSexos, listaDeSalarios);
                    break;

                case 4:
                    System.out.println("=========Média Salarial========");
                    double media = mediaSalarial(listaDeSalarios);
                    System.out.printf("           R$ %.2f%n", media);
                    break;

                case 5:
                    System.out.println("==========Maior Salário=========");
                    maiorSalario(listaDeNomes, listaDeSalarios);
                    break;

                case 6:
                    System.out.println("========Pessoa Mais Nova========");
                    mostrarMaisNovo(listaDeNomes, listaDeIdades);
                    break;

                case 7:
                    System.out.println("Sistema encerrado.");
                    break;
            }
        }
        scanner.close();
    }
}