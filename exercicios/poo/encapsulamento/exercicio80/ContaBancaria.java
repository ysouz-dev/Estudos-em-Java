package exercicios.poo.encapsulamento.exercicio80;

public class ContaBancaria {
    private int conta;
    private String titular;
    private double saldo;

    public ContaBancaria(int conta, String titular, double saldo) {
        this.titular = titular;
        this.conta = conta;
        this.saldo = saldo;
    }
}
