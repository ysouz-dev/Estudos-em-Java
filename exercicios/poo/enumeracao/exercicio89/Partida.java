package exercicios.poo.enumeracao.exercicio89;

public class Partida {
    public enum Status {
        NAO_INICIADA("NÃO INICIADA"),
        EM_ANDAMENTO("EM ANDAMENTO"),
        FINALIZADA("FINALIZADA");

        private String status;

        Status(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }
    }

    private Jogador jogador1;
    private Jogador jogador2;
    private int round;
    private int pontuacaoJogador1;
    private int pontuacaoJogador2;
    private Status status;
}
