package projetos.gerenciador_de_barbearia.model;

import projetos.gerenciador_de_barbearia.util.Validador;

public abstract class Pessoa {
    public enum Sexo {
        MASCULINO,
        FEMININO;

        public static void isSexo(Sexo sexo) {
            if (sexo == null) {
                throw new IllegalArgumentException("Sexo inválido!");
            }
        }
    }

    private String nome;
    private int idade;
    private final String cpf;
    private final Sexo sexo;

    public Pessoa(String nome, int idade, String cpf, Sexo sexo) {
        Validador.validaNome(nome);
        Validador.validaIdade(idade);
        Validador.validaCPF(cpf);
        Sexo.isSexo(sexo);

        this.nome = nome.strip().toUpperCase();
        this.idade = idade;
        this.cpf = cpf.strip();
        this.sexo = sexo;
    }

    public void resumo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Sexo: " + this.sexo);
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCPF() {
        return this.cpf;
    }

    public Sexo getSexo() {
        return this.sexo;
    }
}
