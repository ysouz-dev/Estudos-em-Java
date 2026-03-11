package exercicios.poo.enumeracao.exercicio92;

import java.time.LocalDate;

public class Matricula {
    public enum Status {
        ATIVA,
        TRANCADA,
        CANCELADA,
        CONCLUIDA;

        private boolean podeConcluir() {
            if (this == CANCELADA || this == CONCLUIDA) {
                return false;
            }
            return true;
        }

        private boolean podeTrancar() {
            if (this == CANCELADA || this == CONCLUIDA || this == TRANCADA) {
                return false;
            }
            return true;
        }

        private boolean podeCancelar() {
            if (this == CONCLUIDA || this == CANCELADA) {
                return false;
            }
            return true;
        }

        private boolean podeAtivar() {
            if (this == CANCELADA || this == CONCLUIDA || this == ATIVA) {
                return false;
            }
            return true;
        }

    }

    private static int id = 1;
    private final String NUMERO_MATRICULA;
    private Status statusMatricula;

    public Matricula() {
        this.NUMERO_MATRICULA = (LocalDate.now().getYear() + "0%d".formatted(id));
        id++;
        this.statusMatricula = Status.ATIVA;
    }

    public void ativarMatricula() {
        if (!this.statusMatricula.podeAtivar()) {
            throw new IllegalStateException("Não é possivel ativar uma mátricula já " + this.statusMatricula + ".");
        }

        this.statusMatricula = Status.ATIVA;
    }
}
