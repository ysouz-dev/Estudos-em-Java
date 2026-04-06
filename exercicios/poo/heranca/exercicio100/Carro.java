package exercicios.poo.heranca.exercicio100;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, double tanque, double consumo, TipoCombustivel combustivel, int portas) {
        validaPortas(portas);
        super(marca, modelo, tanque, consumo, combustivel);
        this.portas = portas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de portas: " + this.portas);
    }

    private static void validaPortas(int portas) {
        if (portas < 2) {
            throw new IllegalArgumentException("Um carro precisa ter no mínimo 2 portas.");
        }
    }
}
