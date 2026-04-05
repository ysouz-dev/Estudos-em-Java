package exercicios.poo.heranca.exercicio98;

import java.time.LocalDate;

public abstract class Pedido {
    public enum Status {
        AGUARDANDO,
        ENVIADO,
        ENTREGUE;

        public boolean podeEnviar() {
            return this == AGUARDANDO;
        }

        public boolean podeEntregar() {
            return this == ENVIADO;
        }
    }

    private static int idGeral = 1000;

    private int idPedido;
    private LocalDate data;
    private Status status;

    public Pedido() {
        this.idPedido = idGeral;
        idGeral++;
        this.data = LocalDate.now();
        this.status = Status.AGUARDANDO;
    }

    public void enviarPedido() {
        if (!this.status.podeEnviar()) {
            throw new IllegalStateException("O pedido só pode ser enviado se estiver com status AGUARDANDO");
        }

        this.status = Status.ENVIADO;
    }

    public void entregarPedido() {
        if (!this.status.podeEntregar()) {
            throw new IllegalStateException("O pedido só pode ser entregue se estiver com status ENVIADO");
        }
    }
}
