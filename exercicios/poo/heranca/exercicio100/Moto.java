package exercicios.poo.heranca.exercicio100;

public class Moto extends Veiculo {
    public enum PartidaEletrica {
        SIM,
        NAO;

        public static void isPartidaEletrica(PartidaEletrica partida) {
            if (partida == null) {
                throw new IllegalArgumentException("Entrada referente a partida elétrica inválida!");
            }
        }
    }

    private PartidaEletrica partidaEletrica;

    public Moto(String marca, String modelo, double tanque, double consumo, TipoCombustivel combustivel,
            PartidaEletrica partida) {

        PartidaEletrica.isPartidaEletrica(partida);
        super(marca, modelo, tanque, consumo, combustivel);
        this.partidaEletrica = partida;
    }
}
