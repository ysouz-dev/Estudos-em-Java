package exercicios.poo.encapsulamento.exercicio84;

public class ContaBancaria {
    private String nome;
    private double saldo;
    private Boolean status;

    public ContaBancaria(String nome) {
        this.nome = formataNome(nome);
        this.saldo = 0;
        this.status = null;
    }

    private static String formataNome(String nome) {
        return nome.strip().toUpperCase();
    }
}
