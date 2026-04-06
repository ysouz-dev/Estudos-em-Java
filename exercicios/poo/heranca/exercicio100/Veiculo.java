package exercicios.poo.heranca.exercicio100;

public abstract class Veiculo {
    public enum TipoCombustivel {
        GASOLINA,
        ETANOL,
        DIESEL,
        ELETRICO;

        public static void isCombustivel(TipoCombustivel combustivel) {
            if (combustivel == null) {
                throw new IllegalArgumentException("Combustivel inválido!");
            }
        }
    }

    public enum Status {
        DESLIGADO,
        LIGADO,
        EM_MOVIMENTO,
        EM_MANUTENCAO;

        public boolean podeLigar() {
            return this == DESLIGADO;
        }
    }

    private String marca;
    private String modelo;
    private double capacidadeTanque;
    private double consumoPorLitro;
    private TipoCombustivel tipoCombustivel;
    private Status status;

    public Veiculo(String marca, String modelo, double capacidadeTanque, double consumoPorLitro,
            TipoCombustivel combustivel) {

        validaMarcaEModelo(marca, modelo);
        validaCapacidadeEConsumo(capacidadeTanque, consumoPorLitro);
        TipoCombustivel.isCombustivel(combustivel);

        this.marca = marca.strip().toUpperCase();
        this.modelo = modelo.strip().toUpperCase();
        this.capacidadeTanque = capacidadeTanque;
        this.consumoPorLitro = consumoPorLitro;
        this.tipoCombustivel = combustivel;
        this.status = Status.DESLIGADO;
    }

    public void ligar() {
        if (!this.status.podeLigar()) {
            throw new IllegalStateException("O veículo só pode ser ligado se estiver desligado.");
        }
        this.status = Status.LIGADO;
    }

    private static void validaMarcaEModelo(String marca, String modelo) {
        if (marca == null || marca.isBlank() || marca.strip().length() < 3) {
            throw new IllegalArgumentException("Marca inválida!");
        }

        if (modelo == null || modelo.isBlank() || modelo.strip().length() < 2) {
            throw new IllegalArgumentException("Modelo inválido!");
        }
    }

    private static void validaCapacidadeEConsumo(double capacidadeTanque, double consumo) {
        if (capacidadeTanque < 1) {
            throw new IllegalArgumentException("A capacidade do tanque não pode ser menor que 1 Litro");
        }

        if (consumo < 1) {
            throw new IllegalArgumentException("O consumo do veículo não pode ser menor que 1 KM/L");
        }
    }
}
