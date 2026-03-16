package exercicios.poo.enumeracao.exercicio93;

public enum Rank {
    BRONZE(0, 999),
    PRATA(1000, 1999),
    OURO(2000, 2999),
    PLATINA(3000, Integer.MAX_VALUE);

    private int minimo;
    private int maximo;

    Rank(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public Rank atualizaRank(int pontuacao) {
        if (pontuacao >= BRONZE.minimo && pontuacao <= BRONZE.maximo) {
            return BRONZE;
        } else if (pontuacao >= PRATA.minimo && pontuacao <= PRATA.maximo) {
            return PRATA;
        } else if (pontuacao >= OURO.minimo && pontuacao <= OURO.maximo) {
            return OURO;
        } else {
            return PLATINA;
        }
    }
}
