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

    // getters
    public ArrayList<Cliente> getCliente() {
        return this.listaDeClientes;
    }

    public ArrayList<Plano> getPlano() {
        return this.listaDePlanos;
    }

    public ArrayList<Assinatura> getAssinaturas() {
        return this.listaDeAssinaturas;
    }

    // metodos de instancia
    public void cadastrarCliente(Cliente cliente) {
        if (emailInList(cliente.getEmail(), this.listaDeClientes)) {
            throw new IllegalArgumentException("Email já cadastrado em outro cliente.");
        }

        listaDeClientes.add(cliente);
    }

    public void cadastrarPlano(Plano plano) {
        if (planoInList(plano, this.listaDePlanos)) {
            throw new IllegalArgumentException("Um plano cadastrado já possui esse nome.");
        }

        listaDePlanos.add(plano);
    }

    public void criarAssinatura(Assinatura assinatura) {
        if (clienteInList(assinatura.getCliente(), this.listaDeAssinaturas)) {
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

    public double faturamentoMensal() {
        double faturamento = 0;
        for (Assinatura ass : this.listaDeAssinaturas) {
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

    private static boolean planoInList(Plano plano, ArrayList<Plano> lista) {
        for (Plano plan : lista) {
            if (plano.getNomePlano().equals(plan.getNomePlano())) {
                return true;
            }
        }
        return false;
    }
}