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

    public Pedido(TipoEntrega tipoEntrega) {
        this.idPedido = ("#" + LocalDate.now().getYear() + "0" + id);
        id++;
        this.diaCriacao = LocalDate.now().getDayOfMonth();
        this.mesCriacao = LocalDate.now().getMonthValue();
        this.anoCriacao = LocalDate.now().getYear();
        this.tipoEntrega = tipoEntrega;

    }
}
