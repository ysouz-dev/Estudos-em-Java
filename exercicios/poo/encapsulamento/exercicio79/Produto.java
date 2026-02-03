package exercicios.poo.encapsulamento.exercicio79;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto() {
        this.nome = "<Empty>";
        this.preco = 1.00;
        this.estoque = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String novoNome) {
        if (!validaNome(novoNome)) {
            System.out.println("Error: o nome não pode estar vazio.");
            return false;
        }
        this.nome = novoNome;
        return true;
    }

    public double getPreco() {
        return this.preco;
    }

    public boolean setPreco(double novoPreco) {
        if (!validaPreco(novoPreco)) {
            System.out.println("Error: o preço deve ser maior que 0.");
            return false;
        }
        this.preco = novoPreco;
        return true;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public boolean setEstoque(int novoEstoque) {
        if (!validaEstoque(novoEstoque)) {
            System.out.println("Error: o estoque não pode ser negativo.");
            return false;
        }
        this.estoque = novoEstoque;
        return true;
    }

    public void mostraInfo() {
        System.out.printf("Nome: %s %nPreço: R$ %.2f %nEstoque: %d%n", this.nome, this.preco, this.estoque);
        System.out.println("============================");
    }

    public double valorEstoque() {
        return this.estoque * this.preco;
    }

    public static boolean validaNome(String nome) {
        if (nome.isEmpty()) return false;
        return true;
    }

    public static boolean validaPreco(double preco) {
        return preco > 0;
    }

    public static boolean validaEstoque(int estoque) {
        return estoque >= 0;
    }
}
