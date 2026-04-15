package projetos.gerenciador_de_barbearia.model;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Atendimento {
    public enum Servico {
        CORTE(new BigDecimal("20")),
        PEZINHO(new BigDecimal("5")),
        SOBRANCELHA(new BigDecimal("5")),
        BARBA(new BigDecimal("10")),
        PIGMENTACAO(new BigDecimal("5")),
        LUZES(new BigDecimal("45")),
        PLATINADO(new BigDecimal("50"));

        private BigDecimal valor;

        Servico(BigDecimal valor) {
            this.valor = valor;
        }

        public static void isServico(Servico servico) {
            if (servico == null) {
                throw new IllegalArgumentException("Servico inválido!");
            }
        }
    }

    private ArrayList<Servico> servicosRealizados;
    private Pessoa cliente;

    public Atendimento(Pessoa cliente) {
        this.servicosRealizados = new ArrayList<Servico>();
        this.cliente = cliente;
    }

    public void adicionarServico(Servico servico) {
        Servico.isServico(servico);

        servicosRealizados.add(servico);
    }

}