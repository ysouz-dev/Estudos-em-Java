package exercicios.poo.enumeracao.exercicio90;

public enum MetodoPagamento {
    PIX(0, "PIX"),
    CARTAO_CREDITO(5, "CRÉDITO"),
    CARTAO_DEBITO(2, "DÉBITO"),
    BOLETO(1, "BOLETO");

    private int taxa;
    private String nomeMetodo;

    MetodoPagamento(int taxa, String nomeMetodo) {
        this.taxa = taxa;
        this.nomeMetodo = nomeMetodo;

    }

    public int getTaxa() {
        return this.taxa;
    }

    public String getNomeMetodo() {
        return this.nomeMetodo;
    }
}
