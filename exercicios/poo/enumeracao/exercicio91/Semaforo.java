package exercicios.poo.enumeracao.exercicio91;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Semaforo {
    public enum Status {
        VERMELHO(40),
        AMARELO(5),
        VERDE(30);

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
        this.cor = Status.VERMELHO;
        this.codigoCor = this.cor.ordinal();
        this.ultimaHoraUsado = LocalTime.now();
        this.intervalo = this.cor.getDuracao();
        this.reverse = false;
    }
}