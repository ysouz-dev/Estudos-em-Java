package exercicios.poo.enumeracao.exercicio93;

public class Jogador {
    private String nome;
    private int pontuacao;
    private Rank rank;

    public Jogador(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = nome.strip().toUpperCase();
        this.pontuacao = 0;
        this.rank = Rank.BRONZE;
    }

    public void adicionarPontos(int pontos) {
        this.pontuacao += pontos;
    }

    private static boolean validaPontos(int pontos) {
        return pontos >= 1;
    }

    private static boolean validaNome(String nome) {
        if (nome == null || nome.strip().isEmpty() || nome.strip().length() < 3) {
            return false;
        }

        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
