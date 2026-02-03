package exercicios.poo.classes_e_objetos.exercicio78;

public class Funcionario {
    String nome;
    double salario;

    public void aumentarSalario (int percentual) {
        this.salario += percentual / 100 * this.salario;
        System.out.printf("Parabens pelo aumento %s!%n", this.nome);
    }

    public void mostrarDados() {
        System.out.println("=================");
        System.out.printf("Nome: %s %nSalário: R$ %.2f%n", this.nome, this.salario);
        System.out.println("=================");
    }

    public boolean validaNomeFuncionario() {
        if (this.nome.isEmpty()) return false;

        String nomeSemEspaco = this.nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean validaSalario () {
        return this.salario > 0;
    }

    public static boolean validaPercentual(int percentual) {
        return percentual >= 0 && percentual <= 100;
    }
}
