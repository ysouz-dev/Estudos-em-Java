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
}
