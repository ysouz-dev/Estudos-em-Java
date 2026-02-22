package projetos.gerenciamento_de_assinaturas.model;

public class Plano {
    private String nomePlano;
    private double valorMensal;
    private int limiteTelas;

    public Plano(String nome, double valor, int limite) {
        this.nomePlano = nome;
        this.valorMensal = valor;
        this.limiteTelas = limite;
    }
}