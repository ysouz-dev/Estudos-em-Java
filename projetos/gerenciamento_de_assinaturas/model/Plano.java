package projetos.gerenciamento_de_assinaturas.model;

public class Plano {
    private String nomePlano;
    private double valorMensal;
    private int limiteTelas;

    public Plano(String nome, double valor, int limite) {
        if (!validaNomePlano(nome.strip())) {
            throw new IllegalArgumentException("Nome do plano inválido!");
        }

        if (!isPositvo(valor)) {
            throw new IllegalArgumentException("Valor da mensalidade não pode ser negativo.");
        }

        if (!isPositvo(limite)) {
            throw new IllegalArgumentException("limite de telas não pode ser negativo.");
        }

        this.nomePlano = nome;
        this.valorMensal = valor;
        this.limiteTelas = limite;
    }

    // getters
    public String getNomePlano() {
        return this.nomePlano;
    }

    public double getValorMensalidade() {
        return this.valorMensal;
    }

    public int getLimiteTelas() {
        return this.limiteTelas;
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