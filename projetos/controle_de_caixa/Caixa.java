package projetos.controle_de_caixa;

public class Caixa {
    private static int contadorId = 1000;

    private int id;
    private double saldo;
    private boolean aberto;
    private Movimentacao[] listaDeMovimentacoes;

    public Caixa() {
        this.id = contadorId;
        contadorId++;
        this.saldo = 0;
        this.aberto = false;
        this.listaDeMovimentacoes = new Movimentacao[0];
    }

    public void abrirCaixa() {
        if (this.aberto) {
            System.out.println("Erro: Caixa já aberto.");
            return;
        }
        this.aberto = true;
        System.out.println("Caixa aberto!");
    }
}