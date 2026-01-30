package exercicios.poo.classes_e_objetos.exercicio75;

public class Produto {
    String nome;
    double preco;
    int estoque;
    
    public void mostrarDados() {
        System.out.println("===== Produto =====");
        System.out.printf("Nome: %s %nPreço: R$ %.2f %nEstoque: %d%n", this.nome, this.preco, this.estoque);
        System.out.println("===================");
    }

    public double valorTotalEstoque() {
        return this.preco * this.estoque;
    }
}

