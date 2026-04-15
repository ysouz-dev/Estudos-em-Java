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

        public BigDecimal getValor() {
            return this.valor;
        }

        public static void listarServicos() {
            Servico[] lista = Servico.values();
            for (int i = 0; i < lista.length; i++) {
                System.out.printf("[ %d ] - %s R$ %.2f%n", i + 1, lista[i], lista[i].getValor());
            }
        }

        public static void isServico(Servico servico) {
            if (servico == null) {
                throw new IllegalArgumentException("Serviço inválido!");
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
        if (containsServico(servicosRealizados, servico)) {
            throw new IllegalArgumentException("Esse serviço já foi registrado nesse atendimento.");
        }

        servicosRealizados.add(servico);
    }

    public Pessoa getPessoa() {
        return this.cliente;
    }

    private static boolean containsServico(ArrayList<Servico> lista, Servico servico) {
        for (Servico service : lista) {
            if (servico == service) {
                return true;
            }
        }
        return false;
    }

}