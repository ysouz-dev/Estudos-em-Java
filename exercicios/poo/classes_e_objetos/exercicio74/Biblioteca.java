package exercicios.poo.classes_e_objetos.exercicio74;

public class Biblioteca {
    Livro[] listaDeLivros = new Livro[0];
    
    public static Livro CadastrarLivro() {
        Livro livroNovo = new Livro();
        return livroNovo;
    }
}