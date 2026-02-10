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
            } else if (limiteDiario == 0) {
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
}
