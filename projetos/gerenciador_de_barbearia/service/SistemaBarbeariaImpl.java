package projetos.gerenciador_de_barbearia.service;

import projetos.gerenciador_de_barbearia.model.*;
import projetos.gerenciador_de_barbearia.util.Formatador;
import java.util.ArrayList;

public final class SistemaBarbeariaImpl implements SistemaBarbearia {
    private ArrayList<Pessoa> listaPessoas;
    private ArrayList<Atendimento> listaAtendimentos;

    public SistemaBarbeariaImpl() {
        this.listaPessoas = new ArrayList<Pessoa>();
        this.listaAtendimentos = new ArrayList<Atendimento>();
    }

    @Override
    public void cadastrarCliente(Pessoa pessoa) {
        if (containsPessoa(listaPessoas, pessoa)) {
            throw new IllegalArgumentException("O sistema já possui um cliente cadastrado com esse cpf.");
        }
        listaPessoas.add(pessoa);
    }

    @Override
    public void cadastrarAtendimento(Pessoa pessoa, Atendimento atendimento) {
        if (!containsPessoa(listaPessoas, pessoa)) {
            throw new IllegalArgumentException("Esse cliente não possui cadastro no sistema.");
        }
        listaAtendimentos.add(atendimento);
    }

    @Override
    public void listarClientes() {
        if (this.listaPessoas.size() == 0) {
            throw new IllegalStateException("Nenhum cliente cadastrado no sistema.");
        }
        for (Pessoa pessoa : listaPessoas) {
            pessoa.resumo();
            Formatador.linha();
        }
    }

    private static boolean containsPessoa(ArrayList<Pessoa> lista, Pessoa pessoa) {
        for (Pessoa people : lista) {
            if (pessoa.getCPF().equals(people.getCPF())) {
                return true;
            }
        }
        return false;
    }
}
