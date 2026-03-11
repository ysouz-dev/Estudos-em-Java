package exercicios.poo.enumeracao.exercicio92;

public class Aluno {
    private String nome;
    private int idade;
    private Matricula matricula;

    public Aluno(String nome, int idade) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        } else if (!validaIdade(idade)) {
            throw new IllegalArgumentException("Idade inválida!");
        }

        this.nome = nome.strip().toUpperCase();
        this.idade = idade;
        this.matricula = new Matricula();
    }

    private static boolean validaIdade(int idade) {
        return idade > 0 && idade <= 75;
    }

    private static boolean validaNome(String nome) {
        if (nome == null || nome.strip().isEmpty() || nome.strip().length() < 3) {
            return false;
        }

        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
