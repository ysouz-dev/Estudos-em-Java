package projetos.gerenciador_de_barbearia.service;

import projetos.gerenciador_de_barbearia.model.Pessoa;
import java.util.ArrayList;

public final class SistemaBarbeariaImpl implements SistemaBarbearia {
    private ArrayList<Pessoa> listaPessoas;

    public SistemaBarbeariaImpl() {
        this.listaPessoas = new ArrayList<Pessoa>();
    }

    @Override
    public void cadastrarCliente(Pessoa pessoa) {
        if (containsPessoa(listaPessoas, pessoa)) {
            throw new IllegalArgumentException("O sistema já possui um cliente cadastrado com esse cpf.");
        }
        listaPessoas.add(pessoa);
    }

    @Override
    public void listarClientes() {
        if (this.listaPessoas.size() == 0) {
            throw new IllegalStateException("Nenhum cliente cadastrado no sistema.");
        }
        for (Pessoa pessoa : listaPessoas) {
            pessoa.resumo();
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
