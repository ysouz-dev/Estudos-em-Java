package exercicios.poo.heranca.exercicio99;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome.strip().toUpperCase();
        this.idade = idade;
    }
}
