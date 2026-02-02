package exercicios.poo.classes_e_objetos.exercicio77;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public boolean ehAprovado() {
        return calcularMedia() >= 7.0;
    }
}