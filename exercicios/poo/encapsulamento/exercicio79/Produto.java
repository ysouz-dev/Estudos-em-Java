package exercicios.poo.encapsulamento.exercicio79;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}
