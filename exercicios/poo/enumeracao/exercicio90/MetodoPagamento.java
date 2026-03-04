package exercicios.poo.enumeracao.exercicio90;

public enum MetodoPagamento {
    PIX(0),
    CARTAO_CREDITO(5),
    CARTAO_DEBITO(2),
    BOLETO(1);

    private int taxa;

    MetodoPagamento(int taxa) {
        this.taxa = taxa;
    }

    public int getTaxa() {
        return this.taxa;
    }
}
