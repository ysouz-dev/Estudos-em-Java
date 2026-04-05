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

    private static void validaSalario(BigDecimal salario) {
        if (salario == null) {
            throw new IllegalArgumentException("Salário inválido!");
        }

        if (salario.compareTo(new BigDecimal("1621.00")) < 1621) {
            throw new IllegalArgumentException("O salário do professor não pode ser menor que o salário mínimo.");
        }
    }
}
