package exercicios.poo.heranca.exercicio95;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        validaNome(nome);
        validaSalario(salarioBase);

        this.nome = nome.strip().toUpperCase();
        this.salarioBase = salarioBase;
    }

    protected void calcularSalario() {
        double bonus = 0;
        aumentarSalario(bonus);
    }

    public void aumentarSalario(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Aumento inválido!");
        }

        this.salarioBase += valor;
    }

    private static void validaSalario(double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Salário inválido!");
        }
    }

    private static void validaNome(String nome) {
        if (nome == null || nome.strip().isEmpty() || nome.strip().length() < 3) {
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
