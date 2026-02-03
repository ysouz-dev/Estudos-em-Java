package exercicios.poo.encapsulamento.exercicio79;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        if (!validaNome(novoNome)) {
            System.out.println("Error: o nome deve conter apenas caracteres alfabéticos.");
            return;
        }
        this.nome = novoNome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double novoPreco) {
        if (!validaPreco(novoPreco)) {
            System.out.println("Error: o preço deve ser maior que 0.");
            return;
        }
        this.preco = novoPreco;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int novoEstoque) {
        if (!validaEstoque(novoEstoque)) {
            System.out.println("Error: o estoque não pode ser negativo.");
            return;
        }
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

    public static boolean validaEstoque(int estoque) {
        return estoque >= 0;
    }
}
