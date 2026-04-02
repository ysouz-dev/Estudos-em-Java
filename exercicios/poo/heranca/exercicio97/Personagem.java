package exercicios.poo.heranca.exercicio97;

public abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome) {
        validaNome(nome);

        this.nome = nome.strip().toUpperCase();
        this.vida = 100;
    }

    public int getVida() {
        return this.vida;
    }

    public String getNome() {
        return this.nome;
    }

    public void reduzirVida(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }

        this.vida -= quantidade;
    }

    private static void validaNome(String nome) {
        if (nome == null || nome.isBlank() || nome.strip().length() < 3) {
            throw new IllegalArgumentException("Nome de personagem inválido!");
        }
    }
}
