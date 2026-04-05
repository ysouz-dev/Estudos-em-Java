package exercicios.poo.heranca.exercicio98;

public class PedidoInternacional extends Pedido {
    private double taxaImportacao;

    public PedidoInternacional() {
        this.taxaImportacao = 5;
    }

    @Override
    public double calcularFrete() {
        return this.getFrete() + this.taxaImportacao;
    }

    @Override
    public void resumo() {
        super.resumo();
        System.out.println("Taxa de importação: R$ %.2f".formatted(this.taxaImportacao));
        System.out.println("Frete total: R$ %.2f".formatted(calcularFrete()));
    }
}
