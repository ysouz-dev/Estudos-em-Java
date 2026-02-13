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
}
