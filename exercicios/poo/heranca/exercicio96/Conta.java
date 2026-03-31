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

    public void depositar(BigDecimal valor) {
        if (!this.status.estaAtiva()) {
            throw new IllegalStateException("Não é possivel depositar com a conta BLOQUEADA!");
        }

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido!");
        }

        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (!this.status.estaAtiva()) {
            throw new IllegalStateException("Não é possivel sacar com a conta BLOQUEADA!");
        }

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido!");
        }

        if (this.saldo.subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor de saque inválido!");
        }

        this.saldo = this.saldo.subtract(valor);
    }

    public void ativarConta() {
        if (!this.status.podeAtivar()) {
            throw new IllegalStateException("Não é possivel ativar uma conta já ativada!");
        }
        this.status = Status.ATIVA;
    }

    public void bloquearConta() {
        if (!this.status.podeBloquear()) {
            throw new IllegalStateException("Não é possivel bloquear uma conta já bloqueada!");
        }
        this.status = Status.BLOQUEADA;
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
