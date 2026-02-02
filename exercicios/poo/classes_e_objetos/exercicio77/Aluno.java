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

    public void situacao() {
        if (ehAprovado()) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }

    public boolean validaNomeAluno() {
        String nomeSemEspaco = this.nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    } 
}