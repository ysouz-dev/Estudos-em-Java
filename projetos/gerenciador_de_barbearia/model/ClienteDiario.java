package projetos.gerenciador_de_barbearia.model;

public class ClienteDiario extends Pessoa {
    private int totalAtendimentos;

    public ClienteDiario(String nome, int idade, String cpf, Sexo sexo) {
        super(nome, idade, cpf, sexo);
        this.totalAtendimentos = 0;
    }

    public void aumentarAtendimento() {
        this.totalAtendimentos++;
    }

    @Override
    public void resumo() {
        super.resumo();
        System.out.println("Total de atendimentos: " + this.totalAtendimentos);
    }
}
