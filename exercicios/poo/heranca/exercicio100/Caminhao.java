package exercicios.poo.heranca.exercicio100;

public class Caminhao extends Veiculo {
    private double pesoCarga;

    public Caminhao(String marca, String modelo, double tanque, double consumo, TipoCombustivel combustivel,
            double pesoCarga) {
        super(marca, modelo, tanque, consumo, combustivel);
        this.pesoCarga = pesoCarga;
    }
}
