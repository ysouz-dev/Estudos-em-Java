package exercicios.poo.encapsulamento.exercicio86;

public class Inscricao {
    private String nomeParticipante;
    private String email;
    private boolean pagamentoConfirmado;
    private boolean ativa;

    public Inscricao(String nomeParticipante, String email) {
        this.nomeParticipante = nomeParticipante;
        this.email = email;
        this.pagamentoConfirmado = false;
        this.ativa = false;
    }
}
