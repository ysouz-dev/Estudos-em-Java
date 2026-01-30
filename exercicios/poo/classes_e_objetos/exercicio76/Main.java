/* Crie uma classe de conta bancária.
Atributos:
- número da conta
- nome do titular
- saldo
Métodos:
- depositar valor
- sacar valor (não permitir se saldo insuficiente)
- mostrar saldo
No programa principal:
- crie uma conta
- faça depósito
- faça saque
- mostre saldo final */

package exercicios.poo.classes_e_objetos.exercicio76;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.mostrarSaldo();
        conta.depositar(1512.64);
        System.out.println("===========");
        
        conta.sacar(2000);
        conta.mostrarSaldo();
        System.out.println("==========");

        conta.sacar(150);
        conta.mostrarSaldo();
        System.out.println("==========");
    }
}