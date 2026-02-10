package exercicios.poo.encapsulamento.exercicio83;

public class ContaSimples {
    private String nome;
    private double saldo;

    public ContaSimples(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = nome.strip().toUpperCase();
        this.saldo = 0;
    }

    public static boolean validaNome(String nome) {
        String nomeSemEspaco = nome.strip().replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}