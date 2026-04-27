package projetos.gerenciador_de_barbearia.service;

import projetos.gerenciador_de_barbearia.model.*;

public interface SistemaBarbearia {
    public void cadastrarCliente(Pessoa pessoa);

    public void cadastrarAtendimento(Atendimento atendimento);

    public void listarClientes();

    public void listarAtendimentos();

    public void removerCliente(Pessoa pessoa);

    public void removerAtendimento(Atendimento atendimento);

    public void estatisticas();
}
