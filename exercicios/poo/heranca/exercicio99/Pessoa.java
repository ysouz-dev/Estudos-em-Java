package exercicios.poo.heranca.exercicio99;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome.strip().toUpperCase();
        this.idade = idade;
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
