package exercicios.poo.heranca.exercicio96;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
    private BigDecimal taxaSaque;

    public ContaCorrente(String titular) {
        super(titular);
        this.taxaSaque = new BigDecimal("0.02");
    }

    @Override
    public void sacar(BigDecimal valor) {
        BigDecimal valorDaTaxa = valor.multiply(this.taxaSaque);
        super.sacar(valor.add(valorDaTaxa));
    }

    @Override
    public void resumo() {
        super.resumo();
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Taxa de saque: 2%");
    }
}
