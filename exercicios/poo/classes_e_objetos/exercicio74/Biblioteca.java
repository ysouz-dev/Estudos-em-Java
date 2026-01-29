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

        
    }

    public static boolean validaTitulo(String titulo) {
        return titulo.length() > 2;
    }
}