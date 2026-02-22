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
}