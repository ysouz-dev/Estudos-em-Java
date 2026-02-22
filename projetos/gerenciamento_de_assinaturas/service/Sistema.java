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
}