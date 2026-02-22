package projetos.gerenciamento_de_assinaturas.model;

public class Cliente {
    private static int geradorId = 1000;

    private String nome;
    private String email;
    private int id;
    private boolean status;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.id = geradorId;
        geradorId++;
        this.status = true;
    }
}