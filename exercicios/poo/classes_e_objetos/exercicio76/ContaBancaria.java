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
            System.out.printf("Não é possivel depositar R$ %.2f, escolha um valor maior.%n", valor);
        }
    }
}