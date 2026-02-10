package exercicios.poo.encapsulamento.exercicio83;

public interface Conta {
    public abstract void alterarNome(String novoNome);
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void informacoes();

}