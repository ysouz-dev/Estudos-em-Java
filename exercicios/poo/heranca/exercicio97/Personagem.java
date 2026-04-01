package exercicios.poo.heranca.exercicio97;

public abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome) {
        validaNome(nome);

        this.nome = nome.strip().toUpperCase();
        this.vida = 100;
    }

    private static void validaNome(String nome) {
        if (nome == null || nome.isBlank() || nome.strip().length() < 3) {
            throw new IllegalArgumentException("Nome de personagem inválido!");
        }
    }
}
