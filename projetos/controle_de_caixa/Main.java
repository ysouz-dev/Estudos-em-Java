package projetos.controle_de_caixa;

public class Main {
    public static void main(String[] args) {
        Caixa caixaGeral = new Caixa();
        caixaGeral.abrirCaixa();
        System.out.println("-----");
        
        Movimentacao conta1 = new Movimentacao("salario", 1800, "entrada");
        caixaGeral.adicionarMovimentacao(conta1);
        System.out.println("-----");
        
        Movimentacao conta2 = new Movimentacao("aluguel", 800, "saida");
        caixaGeral.adicionarMovimentacao(conta2);
        System.out.println("-----");
        
        Movimentacao conta3 = new Movimentacao("compras", 400, "saida");
        caixaGeral.adicionarMovimentacao(conta3);
        System.out.println("-----");
        
        caixaGeral.fecharCaixa();
        System.out.println("-----");
        
        caixaGeral.mostrarEntradas();
        System.out.println("-----");
        
        caixaGeral.mostrarSaidas();
        System.out.println("-----");
        
        caixaGeral.relatorio();
        System.out.println("-----");
    }
}