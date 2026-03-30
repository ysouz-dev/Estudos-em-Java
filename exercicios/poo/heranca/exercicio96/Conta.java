package exercicios.poo.heranca.exercicio96;

import java.math.BigDecimal;

public abstract class Conta {
    private String titular;
    private BigDecimal saldo;

    public Conta(String titular) {
        validaTitular(titular);

        this.titular = titular.strip().toUpperCase();
        this.saldo = BigDecimal.ZERO;
    }

    public String getTitular() {
        return this.titular;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido!");
        }

        String valorDepositado = String.valueOf(valor);
        this.saldo = this.saldo.add(new BigDecimal(valorDepositado));
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido!");
        }

        String valorSacado = String.valueOf(valor);
        if (this.saldo.subtract(new BigDecimal(valorSacado)).compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor de saque inválido!");
        }

        this.saldo = this.saldo.subtract(new BigDecimal(valorSacado));
    }

    private static void validaTitular(String titular) {
        if (titular == null || titular.isBlank() || titular.strip().length() < 3) {
            throw new IllegalArgumentException("Nome do titular inválido!");
        }

        String titularSemEspaco = titular.replace(" ", "");
        for (int i = 0; i < titularSemEspaco.length(); i++) {
            if (!Character.isLetter(titularSemEspaco.charAt(i))) {
                throw new IllegalArgumentException("Nome do titular inválido!");
            }
        }
    }
}
