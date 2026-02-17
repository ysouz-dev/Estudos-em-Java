package exercicios.poo.encapsulamento.exercicio87;

import java.util.ArrayList;

public class SistemaVotacao {
    private ArrayList<String> votos1;
    private ArrayList<String> votos2;
    private int primeiroVoto;

    public SistemaVotacao() {
        this.votos1 = new ArrayList<String>();
        this.votos2 = new ArrayList<String>();
    }

    private static boolean validaVoto(int voto) {
        return voto == 1 || voto == 2;
    }
}