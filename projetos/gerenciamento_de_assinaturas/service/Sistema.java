package projetos.gerenciamento_de_assinaturas.service;

import java.util.ArrayList;
import projetos.gerenciamento_de_assinaturas.model.*;

public class Sistema {
    private ArrayList<Cliente> listaDeClientes;
    private ArrayList<Plano> listaDePlanos;
    private ArrayList<Assinatura> listaDeAssinaturas;

    public Sistema() {
        this.listaDeClientes = new ArrayList<Cliente>();
        this.listaDePlanos = new ArrayList<Plano>();
        this.listaDeAssinaturas = new ArrayList<Assinatura>();
    }

    // metodos de instancia
    public void cadastrarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }

    public void cadastrarPlano(Plano plano) {
        listaDePlanos.add(plano);
    }

    public void criarAssinatura(Assinatura assinatura) {
        if (clienteInList(assinatura.getCliente(), listaDeAssinaturas)) {
            throw new IllegalArgumentException("Um cliente não pode possuir mais de 1 assinatura ativa.");
        }

        listaDeAssinaturas.add(assinatura);
    }

    public void cancelarAssinatura(Assinatura assinatura) {
        assinatura.cancelarAssinatura();
    }

    public void reativarAssinatura(Assinatura assinatura) {
        assinatura.reativarAssinatura();
    }

    public void listarAssinaturasAtivas() {
        for (Assinatura ass : listaDeAssinaturas) {
            if (ass.getStatus()) {
                System.out.println("----------------------");
                System.out.println("Nome do cliente: " + ass.getCliente().getNome());
                System.out.println("Plano: " + ass.getPlano().getNomePlano());
                System.out.println("Status: " + ((ass.getStatus()) ? "ATIVO" : "INATIVO"));
                System.out.println("Data de início: " + ass.getData());
            }
        }
        System.out.println("----------------------");
    }

    public double faturamentoMensal() {
        double faturamento = 0;
        for (Assinatura ass : listaDeAssinaturas) {
            if (ass.getStatus()) {
                faturamento += ass.getPlano().getValorMensalidade();
            }
        }
        return faturamento;
    }

    // metodos estaticos
    private static boolean clienteInList(Cliente cliente, ArrayList<Assinatura> lista) {
        for (Assinatura ass : lista) {
            if (ass.getCliente().equals(cliente) && ass.getStatus()) {
                return true;
            }
        }
        return false;
    }

    private static boolean emailInList(String email, ArrayList<Cliente> lista) {
        for (Cliente client : lista) {
            if (client.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}