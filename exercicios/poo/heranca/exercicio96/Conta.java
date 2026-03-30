package exercicios.poo.heranca.exercicio96;

import java.math.BigDecimal;

public abstract class Conta {
    private String titular;
    private BigDecimal saldo;

    public Conta(String titular) {
        this.titular = titular.strip().toUpperCase();
        this.saldo = BigDecimal.ZERO;
    }
}
