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

    private static boolean validaMetodoPagamento(String metodo) {
        for (MetodoPagamento met : MetodoPagamento.values()) {
            if (metodo.strip().equalsIgnoreCase(met.getNomeMetodo())) {
                return true;
            }
        }
        return false;
    }
}
