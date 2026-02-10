/* Crie uma interface Conta com:
- depositar(double valor)
- sacar(double valor)
- getSaldo()
- Implemente uma única classe ContaSimples.
Regras:
- saldo privado
- não existe setter de saldo
- validações nos métodos*/

package exercicios.poo.encapsulamento.exercicio83;

public class Main {
    public static void main(String[] args) {
        ContaSimples conta1 = new ContaSimples("Yago Souza");
        conta1.informacoes();

        conta1.depositar(1500);
        System.out.println("---------------------------");
        System.out.println("Depósito realizado!");
        conta1.informacoes();

        conta1.sacar(950);
        System.out.println("---------------------------");
        System.out.println("Saque realizado!");
        conta1.informacoes();

        conta1.alterarNome("Nome aleatório");
        conta1.informacoes();
    }
}