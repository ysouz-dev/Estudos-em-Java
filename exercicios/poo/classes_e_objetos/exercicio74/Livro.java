package exercicios.poo.classes_e_objetos.exercicio74;

public class Livro {
    String titulo;
    String autor;
    int paginas;
    boolean emprestado = false;

    public void emprestarLivro() {
        if (!this.emprestado) {
            this.emprestado = true;
            System.out.printf("Livro %s emprestado!%n", this.titulo);
        } else {
            System.out.printf("O livro %s ja está emprestado.%n", this.titulo);
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

    public void mostrarInfo() {
        System.out.println("============= LIVRO =============");
        System.out.printf("Titulo: %s %nAutor: %s %nPaginas: %d %nEmprestado: %b%n", 
                        this.titulo, this.autor, this.paginas, this.emprestado);
        System.out.println("=============================");        
    }

    public boolean validaTitulo() {
        return this.titulo.length() > 2;
    }

    public boolean validaAutor() {
        String autorSemEspaco = this.autor.replace(" ", "");
        for (int i = 0; i < autorSemEspaco.length(); i++) {
            if (!Character.isLetter(autorSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean validarPagina() {
        return this.paginas > 0;
    }
}
