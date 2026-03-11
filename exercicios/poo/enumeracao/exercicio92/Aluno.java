package exercicios.poo.enumeracao.exercicio92;

public class Aluno {
    private String nome;
    private int idade;
    private Matricula matricula;

    public Aluno(String nome, int idade) {
        this.nome = nome.strip().toUpperCase();
        this.idade = idade;
        this.matricula = new Matricula();
    }
}
