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
        if (!validaEmail(email.strip())) {
            throw new IllegalArgumentException("Email inválido!");
        }

        this.nomeParticipante = formataNome(nomeParticipante);
        this.email = email.strip();
        this.pagamentoConfirmado = false;
        this.ativa = true;
    }

    public String getEmail() {
        return this.email;
    }

    public void confirmarPagamento() {
        isAtiva(this.ativa);

        this.pagamentoConfirmado = true;
    }

    public void cancelarInscricao() {
        isAtiva(this.ativa);

        this.pagamentoConfirmado = false;
        this.ativa = false;
    }

    public void mostraResumo() {
        System.out.println("----- Resumo -----");
        System.out.println("Nome: " + this.nomeParticipante);
        System.out.println("Email: " + this.email);
        System.out.println("Pagamento confirmado: " + ((this.pagamentoConfirmado) ? "SIM" : "NÃO"));
        System.out.println("Ativa: " + ((this.ativa) ? "SIM" : "NÃO"));
    }

    private static void isAtiva(boolean ativa) {
        if (!ativa)
            throw new IllegalStateException("A inscrição se encontra desativada.");
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
        if (formataNome(nome).isEmpty() || formataNome(nome).length() < 3)
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
