package projetos.controle_de_caixa;

public class Movimentacao {
    private static int contadorId = 2000;

    private int id;
    private String descricao;
    private double valor;
    private String tipo;

    public Movimentacao(String descricao, double valor, String tipo) {
        this.id = contadorId;
        contadorId++;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }
}