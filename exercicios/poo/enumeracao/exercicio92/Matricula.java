package exercicios.poo.enumeracao.exercicio92;

import java.time.LocalDate;

public class Matricula {
    public enum Status {
        ATIVA,
        TRANCADA,
        CANCELADA,
        CONCLUIDA;

    }

    private static int id = 0001;
    private final String NUMERO_MATRICULA;
    private Status statusMatricula;

    public Matricula() {
        this.NUMERO_MATRICULA = (LocalDate.now().getYear() + "0%d".formatted(id));
        id++;
        this.statusMatricula = Status.ATIVA;
    }
}
