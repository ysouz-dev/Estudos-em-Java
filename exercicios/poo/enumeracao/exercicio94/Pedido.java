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

        public boolean podeEntregar() {
            if (this != ENVIADO) {
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
        if (tipoEntrega == null) {
            throw new IllegalArgumentException("Tipo de intrega inválido!");
        }

        this.idPedido = ("#" + LocalDate.now().getYear() + "0" + id);
        id++;
        this.dataCriacao = LocalDate.now();
        this.tipoEntrega = tipoEntrega;
        this.estimativaEntrega = this.dataCriacao.plusDays(this.tipoEntrega.getDias());
        this.statusEntrega = Status.AGUARDANDO;

    }

    public void resumo() {
        System.out.println("Id: " + this.idPedido);
        System.out.println("Data do pedido: %d/%d/%d".formatted(this.dataCriacao.getDayOfMonth(),
                this.dataCriacao.getMonthValue(), this.dataCriacao.getYear()));

        System.out.println("Tipo de entrega: " + this.tipoEntrega);
        System.out.println("Estimativa de entrega: %d/%d/%d".formatted(this.estimativaEntrega.getDayOfMonth(),
                this.estimativaEntrega.getMonthValue(), this.estimativaEntrega.getYear()));

        System.out.println("Status da entrega: " + this.statusEntrega);
    }

    public void enviarPedido() {
        if (!this.statusEntrega.podeEnviar()) {
            throw new IllegalStateException("O pedido só pode ser enviado se o status for AGUARDANDO.");
        }

        this.statusEntrega = Status.ENVIADO;

        LocalDate dataEnvio = LocalDate.now();
        this.estimativaEntrega = dataEnvio.plusDays(this.tipoEntrega.getDias());
    }

    public void entregarPedido() {
        if (!this.statusEntrega.podeEntregar()) {
            throw new IllegalStateException("O pedido só pode ser entregue se o status for ENVIADO.");
        }

        this.statusEntrega = Status.ENTREGUE;
    }
}
