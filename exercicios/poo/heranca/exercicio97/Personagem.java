package exercicios.poo.heranca.exercicio97;

public abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome) {
        this.nome = nome.strip().toUpperCase();
        this.vida = 100;
    }
}
