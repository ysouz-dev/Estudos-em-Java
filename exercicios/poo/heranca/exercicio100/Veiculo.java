package exercicios.poo.heranca.exercicio100;

public abstract class Veiculo {
    public enum TipoCombustivel {
        GASOLINA,
        ETANOL,
        DIESEL,
        ELETRICO;
    }

    public enum Status {
        DESLIGADO,
        LIGADO,
        EM_MOVIMENTO,
        EM_MANUTENCAO;
    }

    private String marca;
    private String modelo;
    private double capacidadeTanque;
    private double consumoPorLitro;
    private TipoCombustivel tipoCombustivel;
    private Status status;

    public Veiculo(String marca, String modelo, double capacidadeTanque, double consumoPorLitro,
            TipoCombustivel combustivel) {
        this.marca = marca.strip().toUpperCase();
        this.modelo = modelo.strip().toUpperCase();
        this.capacidadeTanque = capacidadeTanque;
        this.consumoPorLitro = consumoPorLitro;
        this.tipoCombustivel = combustivel;
        this.status = Status.DESLIGADO;
    }
}
