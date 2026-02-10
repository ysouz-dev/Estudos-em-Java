package exercicios.poo.encapsulamento.exercicio83;

public class ContaSimples implements Conta{
    private String nome;
    private double saldo;

    public ContaSimples(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = nome.strip().toUpperCase();
        this.saldo = 0;
    }

    public static boolean validaSaldo(double saldo) {
        return saldo >= 0;
    }

    public static boolean validaNome(String nome) {
        String nomeSemEspaco = nome.strip().replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void alterarNome(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome.strip().toUpperCase();
    }

    @Override
    public void depositar(double valor) {
        if (!validaSaldo(valor)) {
            throw new IllegalArgumentException("Saldo inválido!");
        }
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (!validaSaldo(valor) || valor > this.saldo) {
            String erro = "Saldo inválido!";
            
            if (valor > this.saldo) erro = "Saldo insuficiente!";
            
            throw new IllegalArgumentException(erro);
        }
        this.saldo = valor;
    }

    @Override
    public void informacoes() {
        System.out.println("------- Informações -------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: R$ %.2f".formatted(this.saldo));
    }
}