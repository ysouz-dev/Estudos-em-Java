package exercicios.poo.enumeracao.exercicio92;

public class Matricula {
    public enum Status {
        ATIVA,
        TRANCADA,
        CANCELADA,
        CONCLUIDA;

    }

    private String numeroMatricula;
    private Status statusMatricula;
}
