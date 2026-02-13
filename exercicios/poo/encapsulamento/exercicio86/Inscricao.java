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

    public static boolean validaNome(String nome) {
        if (nome.isEmpty() || nome.length() < 3)
            return false;

        String nomeSemEspaco = formataNome(nome).replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
