package exercicios.poo.heranca.exercicio99;

import java.math.BigDecimal;

public class Professor extends Pessoa {
    public enum Disciplina {
        PORTUGUES,
        MATEMATICA,
        GEOGRAFIA,
        HISTORIA,
        CIENCIAS;
    }

    private boolean emAula;
    private Disciplina disciplina;
    private BigDecimal salario;

    public Professor(String nome, int idade, Disciplina disciplina, BigDecimal salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }
}
