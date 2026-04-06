package exercicios.poo.heranca.exercicio100;

public class Moto extends Veiculo {
    public enum PartidaEletrica {
        SIM,
        NAO;

    }

    private PartidaEletrica partidaEletrica;

    public Moto(String marca, String modelo, double tanque, double consumo, TipoCombustivel combustivel,
            PartidaEletrica partida) {
        super(marca, modelo, tanque, consumo, combustivel);
        this.partidaEletrica = partida;
    }
}
