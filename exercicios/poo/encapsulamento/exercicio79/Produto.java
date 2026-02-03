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

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int novoEstoque) {
        this.estoque = novoEstoque;
    }
}
