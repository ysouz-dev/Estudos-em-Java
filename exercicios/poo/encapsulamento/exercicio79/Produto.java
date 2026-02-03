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

    public static boolean validaNome(String nome) {
        if (nome.isEmpty()) return false;
        
        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validaPreco(double preco) {
        return preco > 0;
    }
    
}
