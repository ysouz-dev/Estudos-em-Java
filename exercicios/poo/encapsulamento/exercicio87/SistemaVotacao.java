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

    public void cadastrarVoto(String nome, int voto) {
        if (!this.ativa) {
            throw new IllegalStateException("A votação precisa estar iniciada para cadastrar");

        } else if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");

        } else if (!validaVoto(voto)) {
            throw new IllegalArgumentException("Voto inválido! (somente 1 ou 2)");
        }

        if (this.primeiroVoto == 0) {
            this.primeiroVoto = voto;
        }

        if (voto == 1) {
            votos1.add(nome.strip().toUpperCase());
        } else {
            votos2.add(nome.strip().toUpperCase());
        }
    }

    public String decidirVencedor() {
        if (this.ativa) {
            throw new IllegalStateException("A votação precisa estar encerrada para decidir vencedor.");
        }

        if (this.votos1.size() > this.votos2.size()) {
            return "Os votos de número 1";
        } else if (this.votos2.size() > this.votos1.size()) {
            return "Os votos de número 2";
        } else {
            String vencedor = (this.primeiroVoto == 1) ? "1" : "2";
            return "Houve um empate! mas o vencedor é quem recebeu o primeiro voto. Vencedor: número %s"
                    .formatted(vencedor);
        }
    }

    public void verStatusVotacao() {
        System.out.println("Votos 1: " + this.votos1.size() + " votos");
        System.out.println("Votos 2: " + this.votos2.size() + " votos");
        System.out.println("Status: " + ((!this.ativa) ? "Inativa" : "Ativa"));
        System.out.println("Primeiro voto: " + ((this.primeiroVoto != 0) ? this.primeiroVoto : "Nenhum voto"));
    }

    public void iniciarVotacao() {
        if (this.ativa) {
            throw new IllegalStateException("A votação já está em andamento!");
        }
        this.ativa = true;
    }

    public void encerrarVotacao() {
        if (!this.ativa) {
            throw new IllegalStateException("A votação já está encerrada!");
        }
        this.ativa = false;
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