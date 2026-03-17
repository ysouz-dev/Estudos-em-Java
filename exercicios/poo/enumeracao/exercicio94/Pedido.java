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
    private LocalDate dataCriacao;
    private TipoEntrega tipoEntrega;
    private int estimativaEntrega;

    public Pedido(TipoEntrega tipoEntrega) {
        if (!tipoEntrega.hasTipoEntrega()) {
            throw new IllegalArgumentException();
        }

        this.idPedido = ("#" + LocalDate.now().getYear() + "0" + id);
        id++;
        this.dataCriacao = LocalDate.now();
        this.tipoEntrega = tipoEntrega;

    }
}
