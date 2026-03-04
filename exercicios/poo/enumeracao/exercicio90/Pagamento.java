package exercicios.poo.enumeracao.exercicio90;

public class Pagamento {
    private double valorPagamento;
    private MetodoPagamento metodoPagamento;
    private StatusPagamento statusPagamento;

    public Pagamento(double valorPagamento, String metodoPagamento) {
        if (!validaMetodoPagamento(metodoPagamento)) {
            throw new IllegalArgumentException("Método de pagamento inválido!");
        }

        if (!validaValor(valorPagamento)) {
            throw new IllegalArgumentException("Valor de pagamento inválido!");
        }

        this.valorPagamento = valorPagamento;
        this.metodoPagamento = toMetodoPagamento(metodoPagamento);
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    public void realizarPagamento() {
        if (this.statusPagamento != StatusPagamento.PENDENTE) {
            throw new IllegalStateException("O status do pagamento não permite realizar o pagamento.");
        }

        this.statusPagamento = StatusPagamento.PROCESSADO;
    }

    public void cancelarPagamento() {
        if (this.statusPagamento != StatusPagamento.PENDENTE) {
            throw new IllegalStateException("O status do pagamento não permite cancelar o pagamento.");
        }

        this.statusPagamento = StatusPagamento.CANCELADO;
    }

    private static MetodoPagamento toMetodoPagamento(String metodo) {
        MetodoPagamento metodoNovo = null;
        for (MetodoPagamento met : MetodoPagamento.values()) {
            if (removeAcento(metodo).strip().toUpperCase().equals(removeAcento(met.getNomeMetodo()))) {
                metodoNovo = met;
            }
        }
        return metodoNovo;
    }

    private static String removeAcento(String texto) {
        final char ACENTO = 'É';
        String textoSemAcento = texto;
        for (int i = 0; i < texto.strip().length(); i++) {
            if (texto.strip().toUpperCase().charAt(i) == ACENTO) {
                textoSemAcento = texto.replace(texto.charAt(i), 'E');
            }
        }
        return textoSemAcento;
    }

    private static boolean validaValor(double valor) {
        return valor >= 1;
    }

    private static boolean validaMetodoPagamento(String metodo) {
        for (MetodoPagamento met : MetodoPagamento.values()) {
            if (removeAcento(metodo).strip().equalsIgnoreCase(removeAcento(met.getNomeMetodo()))) {
                return true;
            }
        }
        return false;
    }
}
