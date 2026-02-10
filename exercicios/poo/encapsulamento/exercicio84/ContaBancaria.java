package exercicios.poo.encapsulamento.exercicio84;

public class ContaBancaria {
    private String nome;
    private double saldo;
    private Boolean status;

    public ContaBancaria(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = formataNome(nome);
        this.saldo = 0;
        this.status = null;
    }

    private static boolean validaNome(String nome) {
        String nomeSemEspaco = formataNome(nome).replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static String formataNome(String nome) {
        return nome.strip().toUpperCase();
    }
}
