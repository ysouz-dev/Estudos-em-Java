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

    public Partida(Jogador jogador1, Jogador jogador2) {
        if (!validaJogadores(jogador1, jogador2)) {
            throw new IllegalArgumentException("Os jogadores devem ser diferentes.");
        }

        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.round = 0;
        this.pontuacaoJogador1 = 0;
        this.pontuacaoJogador2 = 0;
        this.status = Status.NAO_INICIADA;
    }

    public void iniciarPartida() {
        if (this.status != Status.NAO_INICIADA) {
            throw new IllegalStateException("A partida só pode ser iniciada se ela não tiver sido iniciada antes.");
        }

        this.status = Status.EM_ANDAMENTO;
    }

    public void finalizarPartida() {
        if (this.status != Status.EM_ANDAMENTO) {
            throw new IllegalStateException("A partida só pode ser finalizada se ela estiver em andamento.");
        }

        this.status = Status.FINALIZADA;
    }

    private static boolean validaJogadores(Jogador j1, Jogador j2) {
        if (j1 == j2 || j1 == null || j2 == null) {
            return false;
        }
        return true;
    }
}
