package exercicios.poo.classes_e_objetos.exercicio78;

public class Funcionario {
    String nome;
    double salario;

    public void aumentarSalario (int percentual) {
        this.salario += percentual / 100 * this.salario;
        System.out.printf("Parabens pelo aumento %s!%n", this.nome);
    }
}
