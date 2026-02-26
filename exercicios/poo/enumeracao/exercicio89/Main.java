/* Crie um sistema que controla partidas de um jogo de tabuleiro. */

package exercicios.poo.enumeracao.exercicio89;

public class Main {
    public static void mostrarStatusJogador(Jogador jogador) {
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Vitorias: " + jogador.getVitoria());
        System.out.println("Derrotas: " + jogador.getDerrota());
        System.out.println("Empate: " + jogador.getEmpate());
    }

    public static void main(String[] args) {

    }
}
