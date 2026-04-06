package exercicios.poo.heranca.exercicio95;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double bonus = 400;
        return getSalario() + bonus;
    }
}
