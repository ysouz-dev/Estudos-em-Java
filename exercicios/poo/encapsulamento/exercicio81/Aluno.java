package exercicios.poo.encapsulamento.exercicio81;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
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
