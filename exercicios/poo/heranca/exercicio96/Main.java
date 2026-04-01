/* Crie:
- Uma classe base Conta
- Classes derivadas como ContaCorrente e ContaPoupanca
- Um enum StatusConta para representar o estado da conta
Regras:
- Contas podem estar ATIVAS ou BLOQUEADAS
- Não é permitido sacar valores de contas bloqueadas
- Cada tipo de conta pode ter regras diferentes para saque
O sistema deve permitir:
- Depositar
- Sacar
- Validar operações com base no status */

package exercicios.poo.heranca.exercicio96;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contacc = new ContaCorrente("Yago");
        ContaPoupanca contacp = new ContaPoupanca("Yan");
        contacc.depositar(new BigDecimal(100));
        contacp.depositar(new BigDecimal(100));
        contacc.resumo();
        System.out.println("------------------");
        contacp.resumo();
        System.out.println("------------------");

        contacc.sacar(new BigDecimal(50));
        contacp.sacar(new BigDecimal(50));
        contacc.resumo();
        System.out.println("------------------");
        contacp.resumo();
        System.out.println("------------------");

        contacp.sacar(new BigDecimal(50));
        contacp.resumo();

        // teste sacar 49 da conta corrente sem considerar a taxa
        contacc.sacar(new BigDecimal(49));

    }
}
