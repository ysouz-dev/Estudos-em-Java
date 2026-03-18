package exercicios.poo.heranca.exercicio95;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome.strip().toUpperCase();
        this.salarioBase = salarioBase;
    }
}
