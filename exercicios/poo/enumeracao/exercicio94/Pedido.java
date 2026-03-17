package exercicios.poo.enumeracao.exercicio94;

import java.time.LocalDate;

public class Pedido {
    public enum Status {
        AGUARDANDO,
        ENVIADO,
        ENTREGUE;

        public boolean podeEnviar() {
            if (this != AGUARDANDO) {
                return false;
            }
            return true;
        }
    }

    private static int id = 1;
    private String idPedido;
    private LocalDate dataCriacao;
    private TipoEntrega tipoEntrega;
    private LocalDate estimativaEntrega;
    private Status statusEntrega;

    public Pedido(TipoEntrega tipoEntrega) {
        if (!tipoEntrega.hasTipoEntrega()) {
            throw new IllegalArgumentException();
        }

        this.idPedido = ("#" + LocalDate.now().getYear() + "0" + id);
        id++;
        this.dataCriacao = LocalDate.now();
        this.tipoEntrega = tipoEntrega;
        this.estimativaEntrega = this.dataCriacao.plusDays(this.tipoEntrega.getDias());
        this.statusEntrega = Status.AGUARDANDO;

    }
}
