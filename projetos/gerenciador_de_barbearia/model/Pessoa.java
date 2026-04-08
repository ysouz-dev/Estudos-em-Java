package projetos.gerenciador_de_barbearia.model;

public abstract class Pessoa {
    public enum Sexo {
        MASCULINO,
        FEMININO;
    }

    private String nome;
    private int idade;
    private final String cpf;
    private final Sexo sexo;

    public Pessoa(String nome, int idade, String cpf, Sexo sexo) {
        this.nome = nome.strip().toUpperCase();
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }
}
