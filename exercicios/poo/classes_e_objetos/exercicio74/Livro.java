package exercicios.poo.classes_e_objetos.exercicio74;

public class Livro {
    String titulo;
    String autor;
    int paginas;
    boolean emprestado = false;

    public void emprestarLivro() {
        if (!this.emprestado) {
            this.emprestado = true;
            System.out.println("Livro emprestado!");
        } else {
            System.out.println("O livro ja está emprestado.");
        }
    }

    public void devolverLivro() {
        if (this.emprestado) {
            this.emprestado = false;
            System.out.printf("Livro (%s) devolvido!%n", this.titulo);
        } else {
            System.out.printf("O livro %s não está emprestado para se devolver.%n", this.titulo);
        }
    }
}
