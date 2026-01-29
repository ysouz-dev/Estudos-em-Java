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

            if (!validaTitulo(livroNovo.titulo)) {
                System.out.println("Error: o título deve ter pelo menos 2 caracteres.");
            }

        } while (!validaTitulo(livroNovo.titulo));

        do {
            System.out.print("Nome do autor: ");
            livroNovo.autor = scanner.nextLine().strip().toUpperCase();

            if (!validaAutor(livroNovo.autor)) {
                System.out.println("Error: o nome do autor deve conter apenas caracteres alfabéticos.");
            }

        } while (!validaAutor(livroNovo.autor));
    }

    public static boolean validaTitulo(String titulo) {
        return titulo.length() > 2;
    }

    public static boolean validaAutor(String autor) {
        String autorSemEspaco = autor.replace(" ", "");
        for (int i = 0; i < autorSemEspaco.length(); i++) {
            if (!Character.isLetter(autorSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}