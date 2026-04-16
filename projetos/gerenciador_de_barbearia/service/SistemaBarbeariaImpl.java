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

    public Pessoa findPessoa(String cpf) {
        for (Pessoa people : this.listaPessoas) {
            if (people.getCPF().equals(cpf)) {
                return people;
            }
        }
        throw new IllegalArgumentException("Esse CPF não está cadastrado no sistema.");
    }

    public Atendimento findAtendimento(String id) {
        for (Atendimento atendimento : this.listaAtendimentos) {
            if (atendimento.getId().equals(id)) {
                return atendimento;
            }
        }
        throw new IllegalArgumentException("Id de atendimento inexistente ou incorreto.");
    }

    @Override
    public void cadastrarCliente(Pessoa pessoa) {
        if (containsPessoa(listaPessoas, pessoa)) {
            throw new IllegalArgumentException("O sistema já possui um cliente cadastrado com esse cpf.");
        }
        listaPessoas.add(pessoa);
    }

    @Override
    public void cadastrarAtendimento(Atendimento atendimento) {
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

    @Override
    public void listarAtendimentos() {
        if (this.listaAtendimentos.size() == 0) {
            throw new IllegalStateException("Nenhum atendimento cadastrado no sistema.");
        }
        int contador = 1;
        for (Atendimento atendimento : this.listaAtendimentos) {
            System.out.println("N. " + contador);
            atendimento.resumo();
            contador++;
        }
    }

    @Override
    public void removerCliente(Pessoa pessoa) {
        if (!containsPessoa(listaPessoas, pessoa)) {
            throw new IllegalArgumentException("Cliente não está cadastrado no sistema.");
        }
        this.listaPessoas.remove(pessoa);
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
