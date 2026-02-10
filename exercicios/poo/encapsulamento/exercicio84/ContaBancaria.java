package exercicios.poo.encapsulamento.exercicio84;

public class ContaBancaria implements Conta {
    private String nome;
    private double saldo;
    private Boolean status;

    public ContaBancaria(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = formataNome(nome);
        this.saldo = 0;
        this.status = null;
    }

    private static boolean validaNome(String nome) {
        String nomeSemEspaco = formataNome(nome).replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean verificaStatus() {
        if (!this.status || this.status == null) {
            return false;
        }
        return true;
    }

    public static boolean validaValor(double valor) {
        return valor >= 0;
    }

    private static String formataNome(String nome) {
        return nome.strip().toUpperCase();
    }

    @Override
    public void ativar() {
        this.status = true;
    }

    @Override
    public void bloquear() {
        this.status = false;
    }

    @Override
    public void depositar(double valor) {
        if (!validaValor(valor)) {
            throw new IllegalArgumentException("Valor de deposito inválido");
        }
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (!validaValor(valor) || valor > this.saldo) {
            String erro = "Valor de saque inválido!";
            if (valor > this.saldo) erro = "Saldo insuficiente para esse saque.";
            throw new IllegalArgumentException(erro);
        }
        this.saldo -= valor;
    }
}
