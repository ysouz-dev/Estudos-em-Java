package projetos.gerenciador_de_barbearia.model;

import java.util.ArrayList;

public class Atendimento {
    public enum Servico {
        CORTE,
        PEZINHO,
        SOBRANCELHA,
        BARBA,
        PIGMENTACAO,
        LUZES,
        PLATINADO;
    }

    private ArrayList<Servico> servicosRealizados;
    private Pessoa cliente;

    public Atendimento(Pessoa cliente) {
        this.servicosRealizados = new ArrayList<Servico>();
        this.cliente = cliente;
    }

}