package exercicios.poo.enumeracao.exercicio94;

import java.time.LocalDate;

public class Pedido {
    public enum Status {
        AGUARDANDO,
        ENVIADO,
        ENTREGUE
    }

    private static int id = 1;
    private String idPedido;
    private int diaCriacao;
    private int mesCriacao;
    private int anoCriacao;
    private TipoEntrega tipoEntrega;
    private int estimativaEntrega;

}
