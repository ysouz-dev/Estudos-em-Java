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
    
    public void fecharCaixa() {
        if (!this.aberto) {
            System.out.println("Erro: Caixa já está fechado.");
            return;
        }
        this.aberto = false;
        System.out.println("Caixa fechado!");
    }

    public void adicionarMovimentacao(Movimentacao novaMov) {
        if (!this.aberto) {
            System.out.println("Movimentações no caixa só podem ser realizadas com ele aberto.");
            return;
        }

        // adiciona movimentacao a lista
        Movimentacao[] arrayTemporaria = new Movimentacao[this.listaDeMovimentacoes.length + 1];
        for (int i = 0; i < this.listaDeMovimentacoes.length; i++) {
            arrayTemporaria[i] = this.listaDeMovimentacoes[i];
        }
        arrayTemporaria[this.listaDeMovimentacoes.length] = novaMov;
        this.listaDeMovimentacoes = arrayTemporaria;
        
        System.out.println("Movimentação adicionada!");
    }

    public void mostrarEntradas() {
        if (this.listaDeMovimentacoes.length == 0) {
            System.out.println("Nenhuma movimentação registrada.");
            return;
        }

        double valorEntrada = 0;
        int quantidadeEntradas = 0;
        for (int i = 0; i < this.listaDeMovimentacoes.length; i++) {
            if (this.listaDeMovimentacoes[i].getTipo().equals("ENTRADA")) {
                valorEntrada += this.listaDeMovimentacoes[i].getValor();
                quantidadeEntradas++;
            }
        }
        System.out.println("Quantidade de entradas: " + quantidadeEntradas);
        System.out.println("Valor total: R$ %.2f".formatted(valorEntrada));
    }
}