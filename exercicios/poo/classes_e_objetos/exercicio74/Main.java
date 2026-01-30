/*Objetivo: Crie um sistema de biblioteca utilizando uma classe só para livros com: 
Atributos:
- titulo
- autor
- paginas
- emprestado (boolean)*/

package exercicios.poo.classes_e_objetos.exercicio74;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int menu(Scanner scanner) {
        System.out.println("==============================");
        System.out.println("          Biblioteca");
        System.out.println("==============================");
        System.out.println("[ 1 ] Cadastrar livro \n[ 2 ] Emprestar livro \n[ 2 ] Devolver livro \n[ 4 ] Mostrar info \n[ 5 ] Sair");
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
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca estanteDeLivros = new Biblioteca();

        int opcao = 0;
        while (opcao != 5) {
            opcao = menu(scanner);
            switch (opcao) {
                case 1:
                    Livro livroNovo = Biblioteca.CadastrarLivro(scanner);
                    estanteDeLivros.listaDeLivros = estanteDeLivros.adicionaLivroNaLista(livroNovo);
                    break;
            }
        }


    }
}