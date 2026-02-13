package exercicios.poo.encapsulamento.exercicio86;

public class Inscricao {
    private String nomeParticipante;
    private String email;
    private boolean pagamentoConfirmado;
    private boolean ativa;

    public Inscricao(String nomeParticipante, String email) {
        if (!validaNome(nomeParticipante)) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        if (!validaEmail(email)) {
            throw new IllegalArgumentException("Email inválido!");
        }

        this.nomeParticipante = nomeParticipante;
        this.email = email;
        this.pagamentoConfirmado = false;
        this.ativa = true;
    }

    private static String formataNome(String nome) {
        return nome.strip().toUpperCase();
    }

    private static boolean validaEmail(String email) {
        final String[] EMAILS_PERMITIDOS = { "@gmail.com", "@outlook.com", "@yahoo.com" };
        for (String mail : EMAILS_PERMITIDOS) {
            if (email.endsWith(mail)) {
                return true;
            }
        }
        return false;
    }

    private static boolean validaNome(String nome) {
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
