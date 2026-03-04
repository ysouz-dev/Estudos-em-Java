package exercicios.poo.enumeracao.exercicio90;

public class Pagamento {
    private double valorPagamento;
    private MetodoPagamento metodoPagamento;
    private StatusPagamento statusPagamento;

    public Pagamento(double valorPagamento, String metodoPagamento) {
        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = StatusPagamento.PENDENTE;
    }
}
