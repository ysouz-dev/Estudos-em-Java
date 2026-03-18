package exercicios.poo.heranca.exercicio95;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double bonus = 400;
        aumentarSalario(bonus);
    }
}
