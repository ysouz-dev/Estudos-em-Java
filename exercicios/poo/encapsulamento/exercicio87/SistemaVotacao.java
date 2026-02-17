package exercicios.poo.encapsulamento.exercicio87;

import java.util.ArrayList;

public class SistemaVotacao {
    private ArrayList<String> votos1;
    private ArrayList<String> votos2;
    private int primeiroVoto;
    private boolean ativa;

    public SistemaVotacao() {
        this.votos1 = new ArrayList<String>();
        this.votos2 = new ArrayList<String>();
        this.primeiroVoto = 0;
        this.ativa = false;
    }

    public void iniciarVotacao() {
        if (this.ativa) {
            throw new IllegalStateException("A votação já está em andamento!");
        }
        this.ativa = true;
    }

    private static boolean validaNome(String nome) {
        if (nome.isEmpty() || nome.length() < 3) {
            return false;
        }
        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean validaVoto(int voto) {
        return voto == 1 || voto == 2;
    }
}