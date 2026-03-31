package exercicios.poo.heranca.exercicio96;

import java.math.BigDecimal;

public abstract class Conta {
    public enum Status {
        ATIVA,
        BLOQUEADA;

        public boolean estaAtiva() {
            if (this == Status.BLOQUEADA) {
                return false;
            }
            return true;
        }

        public boolean podeBloquear() {
            if (this == Status.BLOQUEADA) {
                return false;
            }
            return true;
        }

        public boolean podeAtivar() {
            if (this == Status.ATIVA) {
                return false;
            }
            return true;
        }
    }

    private String titular;
    private BigDecimal saldo;
    private Status status;

    public Conta(String titular) {
        validaTitular(titular);

        this.titular = titular.strip().toUpperCase();
        this.saldo = BigDecimal.ZERO;
        this.status = Status.ATIVA;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String novoTitular) {
        validaTitular(novoTitular);
        this.titular = novoTitular.strip().toUpperCase();
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (!this.status.estaAtiva()) {
            throw new IllegalStateException("Não é possivel depositar com a conta BLOQUEADA!");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido!");
        }

        String valorDepositado = String.valueOf(valor);
        this.saldo = this.saldo.add(new BigDecimal(valorDepositado));
    }

    public void sacar(double valor) {
        if (!this.status.estaAtiva()) {
            throw new IllegalStateException("Não é possivel sacar com a conta BLOQUEADA!");
        }

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
