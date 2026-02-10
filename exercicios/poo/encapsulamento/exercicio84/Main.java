/* Crie uma conta que pode estar em três estados:
- CRIADA (recém-criada, não pode movimentar)
- ATIVA (pode depositar e sacar)
- BLOQUEADA (nenhuma operação permitida)
Regras:
- estado não pode ser alterado diretamente
- sem setter de estado
- métodos ativar() e bloquear()
- depositar e sacar só funcionam se estiver ATIVA*/

package exercicios.poo.encapsulamento.exercicio84;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Yago Souza");    
        conta.mostrarInfo();

        conta.ativar();
        conta.mostrarInfo();

        conta.depositar(1000);
        conta.mostrarInfo();

        conta.sacar(500);
        conta.mostrarInfo();

        conta.sacar(500);
        conta.mostrarInfo();

        conta.bloquear();
        conta.mostrarInfo();

        // teste de movimentacao apos conta bloqueada
        conta.depositar(10000);
    }
}