package exercicios.poo.encapsulamento.exercicio81;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        if (!validaNome(nome)) throw new IllegalArgumentException("Nome informado inválido!");
        if (!validaNota(nota1) || !validaNota(nota2)) throw new IllegalArgumentException("Nota informada inválida!");

        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public static boolean validaNome(String nome) {
        if (nome.isEmpty() || nome.length() < 3) return false;
        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validaNota(double nota) {
        return nota >= 0 && nota <= 10;
    }
}
