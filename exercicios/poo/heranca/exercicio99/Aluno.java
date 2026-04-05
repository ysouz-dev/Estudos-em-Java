package exercicios.poo.heranca.exercicio99;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    public enum Status {
        ATIVO,
        TRANCADO,
        FORMADO;

        public boolean podeTrancar() {
            return this == ATIVO;
        }

        public boolean podeFormar() {
            return this == ATIVO;
        }

        public boolean podeAtivar() {
            return this == TRANCADO;
        }
    }

    private static int idGeralMatricula = 1;
    private final String matricula;
    private Status status;

    public Aluno(String nome, int idade) {
        super(nome, idade);
        this.matricula = ("#" + LocalDate.now().getYear() + idGeralMatricula);
        idGeralMatricula++;
        this.status = Status.ATIVO;
    }

    public void trancarMatricula() {
        if (!this.status.podeTrancar()) {
            throw new IllegalStateException("A matrícula só pode ser trancada se estiver ATIVA.");
        }

        this.status = Status.TRANCADO;
    }

    public void ativarMatricula() {
        if (!this.status.podeAtivar()) {
            throw new IllegalStateException("A matrícula só pode ser ativada se estiver TRANCADA.");
        }

        this.status = Status.ATIVO;
    }

}
