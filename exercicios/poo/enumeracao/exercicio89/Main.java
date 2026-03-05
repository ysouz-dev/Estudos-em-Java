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
        Jogador j1 = new Jogador("yago");
        Jogador j2 = new Jogador("lucas");

        Partida partida = new Partida(j1, j2);
        partida.iniciarPartida();
        partida.finalizarPartida();
        System.out.println("------------------------");
        System.out.println("Placar: %s %d x %d %s".formatted(partida.getNomeJogador1(), partida.getPontoJogador1(),
                partida.getPontoJogador2(), partida.getNomeJogador2()));
        System.out.println("Rounds: " + partida.getRounds());
        System.out.println("Vencedor: " + partida.nomeVencedor()); // vencedor é escolhido de forma aleatoria
        System.out.println("------------------------");
        mostrarStatusJogador(j1);
        System.out.println("------------------------");
        mostrarStatusJogador(j2);
        System.out.println("------------------------");

        // testa finalizar a mesma partida novamente
        partida.finalizarPartida();

    }
}
