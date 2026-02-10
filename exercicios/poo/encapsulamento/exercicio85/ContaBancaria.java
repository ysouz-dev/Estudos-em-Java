package exercicios.poo.encapsulamento.exercicio85;

public class ContaBancaria implements Conta {
    private double saldo;
    private double limiteDiario;
    private double limiteUsado;

    public ContaBancaria() {
        this.saldo = 0;
        this.limiteDiario = 1000;
        this.limiteUsado = 0;
    }
    
    public void getResumo() {
        System.out.println("Saldo: R$ %.2f".formatted(this.saldo));
        System.out.println("Limite Diário de saque: R$ %.2f".formatted(this.limiteDiario));
        System.out.println("Limite usado: R$ %.2f".formatted(this.limiteUsado));
    }

    private static boolean validaValor(double valor) {
        return valor >= 0;
    }

    @Override
    public void depositar(double valor) {
        if (!validaValor(valor)) {
            throw new IllegalArgumentException("Valor de depósito inválido!");
        }
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (!validaValor(valor) || valor > this.saldo || valor > limiteDiario) {
            String erro = "Valor de saque inválido!";

            if (valor > this.saldo) {
                erro = "Saldo insuficiente para esse saque.";
            } else if (valor > limiteDiario) {
                erro = "Valor desejado superior ao limite diário de saque."; 
            }

            throw new IllegalArgumentException(erro);
        }
        
        if (limiteUsado == limiteDiario) {
            throw new IllegalStateException("Limite diário de saque atingido!");
        }

        this.saldo -= valor;
        this.limiteUsado += valor;
    }

    @Override
    public void virarDia() {
        this.limiteUsado = 0;
    }

    @Override
    public void reajustarLimiteDiario(double valor) {
        if (!validaValor(valor)) {
            throw new IllegalArgumentException("Valor de reajuste inválido!");
        }
        this.limiteDiario = valor;
    }
}
