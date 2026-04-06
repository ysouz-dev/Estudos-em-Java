package exercicios.poo.heranca.exercicio100;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, double tanque, double consumo, TipoCombustivel combustivel, int portas) {
        super(marca, modelo, tanque, consumo, combustivel);
        this.portas = portas;
    }
}
