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

    private static void validaNome(String nome) {
        if (nome == null || nome.isBlank() || nome.strip().length() < 3) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                throw new IllegalArgumentException("Nome inválido!");
            }
        }
    }
}
