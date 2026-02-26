package exercicios.poo.enumeracao.exercicio89;

public class Jogador {
    private String nome;
    private int vitoria, derrota, empate;

    public Jogador(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = nome.strip().toUpperCase();
        this.vitoria = 0;
        this.derrota = 0;
        this.empate = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVitoria() {
        return this.vitoria;
    }

    public int getDerrota() {
        return this.derrota;
    }

    public int getEmpate() {
        return this.empate;
    }

    public void adicionarVitoria() {
        this.vitoria++;
    }

    public void adicionarDerrota() {
        this.derrota++;
    }

    public void adicionarEmpate() {
        this.empate++;
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
        return false;
    }
}
