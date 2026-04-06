package exercicios.poo.heranca.exercicio96;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void resumo() {
        super.resumo();
        System.out.println("Tipo de conta: Poupança");
        System.out.println("Taxa de saque: 0%");
    }
}
