package exercicios.poo.enumeracao.exercicio91;

public class Semaforo {
    public enum Status {
        VERMELHO(40),
        AMARELO(5),
        VERDE(30);

        private int duracao;

        Status(int duracao) {
            this.duracao = duracao;
        }
    }
}