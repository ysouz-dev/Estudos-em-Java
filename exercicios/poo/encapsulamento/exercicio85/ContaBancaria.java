package exercicios.poo.encapsulamento.exercicio85;

public class ContaBancaria {
    private double saldo;
    private double limiteDiario;

    public ContaBancaria() {
        this.saldo = 0;
        this.limiteDiario = 1000;
    }
    
    private static boolean validaValor(double valor) {
        return valor >= 0;
    }
}
