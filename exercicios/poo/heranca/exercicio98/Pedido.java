package exercicios.poo.heranca.exercicio98;

import java.time.LocalDate;

public abstract class Pedido {
    public enum Status {
        AGUARDANDO,
        ENVIADO,
        ENTREGUE;
    }

    private static int idGeral = 1000;

    private int idPedido;
    private LocalDate data;
    private Status status;
}
