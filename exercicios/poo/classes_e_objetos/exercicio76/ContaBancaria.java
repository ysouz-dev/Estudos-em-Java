package exercicios.poo.classes_e_objetos.exercicio76;

public class ContaBancaria {
    int numeroConta;
    String nomeTitular;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.printf("Não é possivel depositar R$ %.2f. escolha um valor maior.%n", valor);
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo && valor > 0 ) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            String erro = "Não é possivel sacar R$ %.2f. escolha um valor maior".formatted(valor);
            if (valor > this.saldo) {
                erro = "Saldo insuficiente para este saque.";
            }
            System.out.println(erro);
        }
    }

    public void mostrarSaldo() {
        System.out.printf("Saldo bancário: R$ %.2f%n", this.saldo);
    }
}