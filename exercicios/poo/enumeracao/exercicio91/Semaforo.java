package exercicios.poo.enumeracao.exercicio91;

import java.time.Duration;
import java.time.LocalTime;

public class Semaforo {
    public enum Status {
        VERDE(20),
        AMARELO(5),
        VERMELHO(25);

        private int duracao;

        Status(int duracao) {
            this.duracao = duracao;
        }

        public int getDuracao() {
            return this.duracao;
        }
    }

    private Status cor;
    private int codigoCor;
    private LocalTime ultimaHoraUsado;
    private int intervalo;
    private boolean reverse;

    public Semaforo() {
        this.cor = Status.VERDE;
        this.codigoCor = this.cor.ordinal();
        this.ultimaHoraUsado = LocalTime.now();
        this.intervalo = this.cor.getDuracao();
        this.reverse = false;
    }

    public Status getStatus() {
        return this.cor;
    }

    public void proximoEstado() {
        if (!inIntervalo()) {
            long tempoRestante = (this.intervalo
                    - Duration.between(this.ultimaHoraUsado, LocalTime.now()).getSeconds());
            throw new IllegalStateException("Metodo em cooldown. Tempo restante: " + tempoRestante + " segundos");
        }

        if (this.codigoCor == 2) {
            this.codigoCor = 0;
            atualizaCor();
        } else {
            this.codigoCor++;
            atualizaCor();
        }
    }

    public long tempoRestante() {
        return this.intervalo - Duration.between(this.ultimaHoraUsado, LocalTime.now()).getSeconds();
    }

    private void atualizaCor() {
        for (Status status : Status.values()) {
            if (this.codigoCor == status.ordinal()) {
                this.cor = status;
            }
        }
    }

    private boolean inIntervalo() {
        Duration tempoPassado = Duration.between(this.ultimaHoraUsado, LocalTime.now());
        if (tempoPassado.getSeconds() < this.intervalo) {
            return false;
        }
        return true;
    }
}