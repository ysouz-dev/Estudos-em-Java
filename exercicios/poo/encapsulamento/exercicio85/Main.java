/* Crie uma conta com:
- saldo
- limite diário de saque
Regras:
- limite reinicia quando a conta é “virada” para o próximo dia (simule com método)
- cada saque consome parte do limite
- sem setter de limite
- validações no objeto */

package exercicios.poo.encapsulamento.exercicio85;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.getResumo();
        System.out.println("--------");

        conta.depositar(1500);
        conta.getResumo();
        System.out.println("--------");
        
        conta.sacar(100);
        conta.getResumo();
        System.out.println("--------");

        conta.sacar(900);
        conta.getResumo();
        System.out.println("--------");

        conta.reajustarLimiteDiario(2000);
        conta.getResumo();
        System.out.println("--------");

        conta.depositar(2600);
        conta.sacar(1000);
        conta.getResumo();
        System.out.println("--------");

        conta.virarDia();
        conta.getResumo();
        System.out.println("--------");

        conta.sacar(2000);
        conta.getResumo();

        conta.sacar(100);
    }
}
