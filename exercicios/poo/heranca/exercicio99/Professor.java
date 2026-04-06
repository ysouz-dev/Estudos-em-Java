package exercicios.poo.heranca.exercicio99;

import java.math.BigDecimal;

public class Professor extends Pessoa {
    public enum Disciplina {
        PORTUGUES,
        MATEMATICA,
        GEOGRAFIA,
        HISTORIA,
        CIENCIAS;

        public static void isDisciplina(Disciplina disciplina) {
            if (disciplina == null) {
                throw new IllegalArgumentException("Disciplina inválida!");
            }
        }
    }

    private boolean emAula;
    private Disciplina disciplina;
    private BigDecimal salario;

    public Professor(String nome, int idade, Disciplina disciplina, BigDecimal salario) {
        Disciplina.isDisciplina(disciplina);
        validaSalario(salario);

        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
        this.emAula = false;
    }

    public void iniciarAula() {
        if (this.emAula) {
            throw new IllegalStateException("O professor já está dando aula.");
        }
        this.emAula = true;
    }

    public void encerrarAula() {
        if (!this.emAula) {
            throw new IllegalStateException("O professor já não está dando aula.");
        }
        this.emAula = false;
    }

    public void aumentarSalario(BigDecimal aumento) {
        if (aumento.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Aumento de salário inválido!");
        }

        this.salario = this.salario.add(aumento);
    }

    private static void validaSalario(BigDecimal salario) {
        if (salario == null) {
            throw new IllegalArgumentException("Salário inválido!");
        }

        if (salario.compareTo(new BigDecimal("1621.00")) < 0) {
            throw new IllegalArgumentException("O salário do professor não pode ser menor que o salário mínimo.");
        }
    }

    @Override
    public void resumo() {
        super.resumo();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Salário: R$ %s".formatted(this.salario.toString()));
        System.out.println("Em aula: " + ((this.emAula) ? "SIM" : "NÃO"));
    }
}
