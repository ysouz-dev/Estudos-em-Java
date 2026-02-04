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

    public static boolean validaNomeTitular(String titular) {
        if (titular.isEmpty() || titular.length() < 2) return false;

        String titularSemEspaco = titular.replace(" ", "");
        for (int i = 0; i < titularSemEspaco.length(); i++) {
            if (!Character.isLetter(titularSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
