package exercicios.poo.enumeracao.exercicio94;

public enum TipoEntrega {
    NORMAL(5),
    EXPRESSA(2),
    SAME_DAY(1);

    private int dias;

    TipoEntrega(int dias) {
        this.dias = dias;
    }
}
