package projetos.gerenciamento_de_assinaturas.model;

import java.time.LocalDate;

public class Assinatura {
    private Cliente cliente;
    private Plano plano;
    private boolean status;
    private String dataInicio;

    public Assinatura(Cliente cliente, Plano plano) {
        this.cliente = cliente;
        this.plano = plano;
        this.status = true;
        this.dataInicio = LocalDate.now().toString();
    }

    // getters
    public Cliente getCliente() {
        return this.cliente;
    }

    public Plano getPlano() {
        return this.plano;
    }

    public boolean getStatus() {
        return this.status;
    }

    public String getData() {
        return this.dataInicio;
    }

    // metodos de instancia
    public void reativarAssinatura() {
        if (this.status) {
            throw new IllegalStateException("A assinatura já está ativa para ser reativada.");
        }
        this.dataInicio = LocalDate.now().toString();
        this.status = true;
    }

    public void cancelarAssinatura() {
        if (!this.status) {
            throw new IllegalStateException("A assinatura já foi cancelada anteriormente.");
        }
        this.status = false;
    }
}