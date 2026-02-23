package projetos.gerenciamento_de_assinaturas.model;

public class Plano {
    private String nomePlano;
    private double valorMensal;
    private int limiteTelas;

    public Plano(String nome, double valor, int limite) {
        this.nomePlano = nome;
        this.valorMensal = valor;
        this.limiteTelas = limite;
    }

    // métodos estáticos
    private static boolean isPositvo(int valor) {
        return valor > 0;
    }

    private static boolean isPositvo(double valor) {
        return valor > 0;
    }

    private static boolean validaNomePlano(String nome) {
        if (nome.isEmpty() || nome.length() < 3) {
            return false;
        }
        return true;
    }
}