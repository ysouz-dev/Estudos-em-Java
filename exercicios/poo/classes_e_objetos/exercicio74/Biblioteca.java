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

        do {
            System.out.print("Quantidade de paginas: ");
            livroNovo.paginas = scanner.nextInt();

            if (!livroNovo.validarPagina()) {
                System.out.println("Error: a quantidade de páginas deve ser maior que 0.");
            }


        } while (!livroNovo.validarPagina());
    }

    public Livro[] adicionaLivroNaLista(Livro livroAdicionado) {
        Livro[] listaNova = new Livro[this.listaDeLivros.length + 1];
        for (int i = 0; i < this.listaDeLivros.length; i++) {
            listaNova[i] = this.listaDeLivros[i];
        }
        listaNova[this.listaDeLivros.length] = livroAdicionado;
        return listaNova;
    }
}