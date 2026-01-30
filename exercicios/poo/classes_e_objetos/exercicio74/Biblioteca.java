package exercicios.poo.classes_e_objetos.exercicio74;

import java.util.Scanner;

public class Biblioteca {
    Livro[] listaDeLivros = new Livro[0];
    
    public static void CadastrarLivro(Scanner scanner) {
        scanner.nextLine();
        Livro livroNovo = new Livro();

        do {
            System.out.print("Título do livro: ");
            livroNovo.titulo = scanner.nextLine();

            if (!livroNovo.validaTitulo()) {
                System.out.println("Error: o título deve ter pelo menos 2 caracteres.");
            }

        } while (!livroNovo.validaTitulo());

        do {
            System.out.print("Nome do autor: ");
            livroNovo.autor = scanner.nextLine().strip().toUpperCase();

            if (!livroNovo.validaAutor()) {
                System.out.println("Error: o nome do autor deve conter apenas caracteres alfabéticos.");
            }

        } while (!livroNovo.validaAutor());
    }
}