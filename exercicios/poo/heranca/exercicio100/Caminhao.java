package exercicios.poo.heranca.exercicio100;

public class Caminhao extends Veiculo {
    private double pesoCarga;

    public Caminhao(String marca, String modelo, double tanque, double consumo, TipoCombustivel combustivel,
            double pesoCarga) {

        super(marca, modelo, tanque, consumo, combustivel);
        validaPeso(pesoCarga);
        this.pesoCarga = pesoCarga;
    }

    @Override
    public double calcularAutonomia() {
        if (this.pesoCarga > 0) {
            double autonomiaBase = super.calcularAutonomia();
            return autonomiaBase - 0.2 * autonomiaBase;
        }
        return super.calcularAutonomia();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Peso da carga: " + this.pesoCarga + " kg");
    }

    private static void validaPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("O peso não pode ser negativo.");
        }
    }
}
