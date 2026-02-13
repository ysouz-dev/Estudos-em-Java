package exercicios.poo.encapsulamento.exercicio86;

public class Evento {
    private String nomeEvento;
    private int totalVagas;
    private Inscricao[] listaDeInscricoes;

    public Evento(String nomeEvento, int totalVagas) {
        this.nomeEvento = nomeEvento;
        this.totalVagas = totalVagas;
        this.listaDeInscricoes = new Inscricao[0];
    }

    private static boolean validaNomeEvento(String nomeEvento) {
        if (nomeEvento.isEmpty() || nomeEvento.length() < 3) {
            return false;
        }
        return true;
    }

    private static String formataNome(String nomeEvento) {
        return nomeEvento.strip().toUpperCase();
    }
}
