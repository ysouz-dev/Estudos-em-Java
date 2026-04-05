package exercicios.poo.heranca.exercicio99;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        validaNome(nome);
        validaIdade(idade);

        this.nome = nome.strip().toUpperCase();
        this.idade = idade;
    }

    public final void fazerAniversário() {
        this.idade++;
    }

    public void resumo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
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
