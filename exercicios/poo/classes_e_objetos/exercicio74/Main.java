/*Objetivo: Crie um sistema de biblioteca utilizando uma classe só para livros com: 
Atributos:
- titulo
- autor
- paginas
- emprestado (boolean)*/

package exercicios.poo.classes_e_objetos.exercicio74;

import java.util.Scanner;

public class Main {

    public static int menu(Scanner scanner) {
        System.out.println("==============================");
        System.out.println("          Biblioteca");
        System.out.println("==============================");
        System.out.println(
                "[ 1 ] Cadastrar livro \n[ 2 ] Emprestar livro \n[ 3 ] Devolver livro \n[ 4 ] Mostrar info \n[ 5 ] Sair");
        System.out.println("==============================");

        int escolha;
        do {
            System.out.print("Qual opção desejada: ");
            escolha = scanner.nextInt();
            if (escolha < 1 || escolha > 5) {
                System.out.printf("Error: %d não é uma opção válida.%n", escolha);
            }
        } while (escolha < 1 || escolha > 5);
        System.out.println("==============================");
        return escolha;
    }

    public static boolean validaCodigoLivro(Livro[] listaDeLivros, int escolha) {
        if (escolha > listaDeLivros.length || escolha < 1) {
            return false;
        }
        return true;
    }

    public static boolean validaSePossuiLivros(Livro[] listaLivros) {
        if (listaLivros.length == 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca estanteDeLivros = new Biblioteca();

        int opcao = 0;
        while (opcao != 5) {
            opcao = menu(scanner);
            switch (opcao) {
                case 1:
                    Livro livroNovo = Biblioteca.cadastrarLivro(scanner);
                    estanteDeLivros.listaDeLivros = estanteDeLivros.adicionaLivroNaLista(livroNovo);
                    System.out.println("\n===== Livro cadastrado! =====");
                    break;

                case 2:
                    if (!validaSePossuiLivros(estanteDeLivros.listaDeLivros)) {
                        System.out.println("A Biblioteca não possui nenhum livro cadastrado.");
                        break;
                    }

                    estanteDeLivros.listarLivros();
                    System.out.print("Digite o código do livro que deseja emprestar: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    if (!validaCodigoLivro(estanteDeLivros.listaDeLivros, escolha)) {
                        System.out.printf("Error: não possui livro com código %d, tente novamente!%n", escolha);
                        break;
                    }

                    estanteDeLivros.listaDeLivros[escolha - 1].emprestarLivro();
                    break;

                case 3:
                    if (!validaSePossuiLivros(estanteDeLivros.listaDeLivros)) {
                        System.out.println("A Biblioteca não possui nenhum livro cadastrado.");
                        break;
                    }

                    estanteDeLivros.listarLivros();
                    System.out.print("Digite o código do livro que deseja devolver: ");
                    int escolha1 = scanner.nextInt();
                    scanner.nextLine();

                    if (!validaCodigoLivro(estanteDeLivros.listaDeLivros, escolha1)) {
                        System.out.printf("Error: não possui livro com código %d, tente novamente!%n", escolha1);
                        break;
                    }

                    estanteDeLivros.listaDeLivros[escolha1 - 1].devolverLivro();
                    break;

                case 4:
                    if (!validaSePossuiLivros(estanteDeLivros.listaDeLivros)) {
                        System.out.println("A Biblioteca não possui nenhum livro cadastrado");
                        break;
                    }

                    estanteDeLivros.listarLivros();
                    System.out.print("Digite o código do livro que deseja ver informações: ");
                    int escolha2 = scanner.nextInt();
                    scanner.nextLine();

                    if (!validaCodigoLivro(estanteDeLivros.listaDeLivros, escolha2)) {
                        System.out.printf("Error: não possui livro com código %d, tente novamente!%n", escolha2);
                        break;
                    }

                    estanteDeLivros.listaDeLivros[escolha2 - 1].mostrarInfo();
                    break;

                case 5:
                    System.out.println("====== Sistema encerrado! ======");
                    scanner.close();
                    break;
            }
        }
    }
}