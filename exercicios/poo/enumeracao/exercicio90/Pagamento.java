package exercicios.poo.enumeracao.exercicio90;

public class Pagamento {
    private double valorPagamento;
    private MetodoPagamento metodoPagamento;
    private StatusPagamento statusPagamento;

    public Pagamento(double valorPagamento, String metodoPagamento) {
        if (!validaMetodoPagamento(metodoPagamento)) {
            throw new IllegalArgumentException("Método de pagamento inválido!");
        }

        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    private static boolean validaMetodoPagamento(String metodo) {
        for (MetodoPagamento met : MetodoPagamento.values()) {
            if (metodo.strip().equalsIgnoreCase(met.getNomeMetodo())) {
                return true;
            }
        }
        return false;
    }
}
