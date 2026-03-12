package exercicios.poo.enumeracao.exercicio93;

public class Jogador {
    private String nome;
    private int pontuacao;
    private Rank rank;

    public Jogador(String nome) {
        this.nome = nome.strip().toUpperCase();
        this.pontuacao = 0;
        this.rank = Rank.BRONZE;
    }
}
