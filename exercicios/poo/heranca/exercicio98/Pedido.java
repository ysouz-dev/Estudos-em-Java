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
    private double frete;
    private LocalDate data;
    private Status status;

    public Pedido() {
        this.idPedido = idGeral;
        idGeral++;
        this.frete = 10;
        this.data = LocalDate.now();
        this.status = Status.AGUARDANDO;
    }

    public double getFrete() {
        return this.frete;
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

        this.status = Status.ENTREGUE;
    }

    public void resumo() {
        System.out.println("Id: " + this.idPedido);

        int dia = this.data.getDayOfMonth();
        int mes = this.data.getMonthValue();
        int ano = this.data.getYear();
        System.out.println("Data: %d/%d/%d".formatted(dia, mes, ano));

        System.out.println("Status do pedido: " + this.status);
        System.out.println("Frete: R$ %.2f".formatted(this.frete));
    }

    public double calcularFrete() {
        return this.frete;
    }
}
