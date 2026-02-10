package exercicios.poo.encapsulamento.exercicio83;

public class ContaSimples {
    private String nome;
    private double saldo;

    public ContaSimples(String nome) {
        this.nome = nome.strip().toUpperCase();
        this.saldo = 0;
    }
}