package exercicios.poo.enumeracao.exercicio88;

import java.util.ArrayList;

public class Pedido {
    public enum Status {
        PENDENTE,
        EM_PREPARO,
        SAIU_PARA_ENTREGA,
        ENTREGUE
    }

    private String nome;
    private ArrayList<String> listaItens;
    private Status status;

    public Pedido(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = nome.strip().toUpperCase();
        this.listaItens = new ArrayList<String>();
        this.status = Status.PENDENTE;
    }

    private static boolean validaNome(String nome) {
        if (nome == null || nome.strip().isEmpty() || nome.length() < 3) {
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
}
