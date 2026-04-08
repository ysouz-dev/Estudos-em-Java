package projetos.gerenciador_de_barbearia.model;

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
        validaNome(nome);
        validaIdade(idade);
        validaCPF(cpf);
        Sexo.isSexo(sexo);

        this.nome = nome.strip().toUpperCase();
        this.idade = idade;
        this.cpf = cpf.strip();
        this.sexo = sexo;
    }

    private static void validaCPF(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.strip().length() < 11) {
            throw new IllegalArgumentException("Cpf inválido!");
        }

        for (int i = 0; i < cpf.strip().length(); i++) {
            if (!Character.isDigit(cpf.strip().charAt(i))) {
                throw new IllegalArgumentException("Cpf inválido!");
            }
        }
    }

    private static void validaIdade(int idade) {
        if (idade < 1 || idade > 100) {
            throw new IllegalArgumentException("Idade inválida!");
        }
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
