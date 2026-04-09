package projetos.gerenciador_de_barbearia.service;

import projetos.gerenciador_de_barbearia.model.Pessoa;
import java.util.ArrayList;

public final class SistemaBarbeariaImpl implements SistemaBarbearia {
    private ArrayList<Pessoa> listaPessoas;

    public SistemaBarbeariaImpl() {
        this.listaPessoas = new ArrayList<Pessoa>();
    }
}
