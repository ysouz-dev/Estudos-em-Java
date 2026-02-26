package exercicios.poo.enumeracao.exercicio89;

public class Jogador {
    private String nome;
    private int vitoria, derrota, empate;

    public Jogador(String nome) {
        this.nome = nome.strip().toUpperCase();
        this.vitoria = 0;
        this.derrota = 0;
        this.empate = 0;
    }
}
