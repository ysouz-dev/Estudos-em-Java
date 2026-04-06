package exercicios.poo.heranca.exercicio95;

public class Desenvolvedor extends Funcionario {
    private String linguaguem;
    private int projetos;

    public Desenvolvedor(String nome, double salarioBase, String linguagem) {
        if (linguagem == null || linguagem.isBlank()) {
            throw new IllegalArgumentException("Linguagem inválida!");
        }
        super(nome, salarioBase);
        this.linguaguem = linguagem.strip().toUpperCase();
        this.projetos = 0;
    }

    @Override
    public double calcularSalario() {
        double bonus = 400 * this.projetos;
        return getSalario() + bonus;
    }

    public void adicionarProjeto() {
        this.projetos++;
    }
}
