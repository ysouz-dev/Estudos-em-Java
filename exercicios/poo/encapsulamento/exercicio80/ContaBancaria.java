package exercicios.poo.encapsulamento.exercicio80;

public class ContaBancaria {
    private static int contadorDeContas = 0;

    private int conta;
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        if (!validaNomeTitular(titular)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.titular = titular;
        this.conta = contadorDeContas;
        contadorDeContas++;
        this.saldo = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean saque(double valor) {
        if (valor <= 0 || valor > this.saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public static boolean validaNomeTitular(String titular) {
        if (titular.isEmpty() || titular.length() < 3) return false;

        String titularSemEspaco = titular.replace(" ", "");
        for (int i = 0; i < titularSemEspaco.length(); i++) {
            if (!Character.isLetter(titularSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
