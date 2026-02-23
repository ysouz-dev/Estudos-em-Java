package projetos.gerenciamento_de_assinaturas.model;

public class Cliente {
    private static int geradorId = 1000;

    private String nome;
    private String email;
    final private int id;
    private boolean status;

    public Cliente(String nome, String email) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        if (!validaEmail(email)) {
            throw new IllegalArgumentException("Email inválido!");
        }

        this.nome = nome;
        this.email = email;
        this.id = geradorId;
        geradorId++;
        this.status = true;
    }

    private static String formataString(String string) {
        return string.strip().toUpperCase();
    }

    private static boolean validaEmail(String email) {
        final String[] EMAILS_PERMITIDOS = { "@GMAIL.COM", "@OUTLOOK.COM", "@HOTMAIL.COM", "@YAHOO.COM" };
        for (String mail : EMAILS_PERMITIDOS) {
            if (email.strip().toUpperCase().endsWith(mail)) {
                return true;
            }
        }
        return false;
    }

    private static boolean validaNome(String nome) {
        if (nome.isEmpty() || nome.length() < 3) {
            return false;
        }
        String nomeSemEspaco = nome.strip().replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}