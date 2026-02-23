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
        listaDeAssinaturas.add(assinatura);
    }

    public void cancelarAssinatura(Assinatura assinatura) {
        assinatura.cancelarAssinatura();
    }

    public void reativarAssinatura(Assinatura assinatura) {
        assinatura.reativarAssinatura();
    }

}