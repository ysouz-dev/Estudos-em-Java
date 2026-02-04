/* Crie uma classe ContaBancaria com:
- número da conta
- titular
- saldo
Regras:
- saldo inicial não pode ser negativo
- saque não pode deixar saldo negativo
- depósito só aceita valores positivos
Exigências:
- saldo NÃO pode ter setter direto
- getter para saldo
- métodos depositar e sacar
- construtor validando estado inicial */

package exercicios.poo.encapsulamento.exercicio80;

import java.util.Scanner;

public class Main {

    public static ContaBancaria cadastraConta(Scanner scanner) {
        System.out.println("===== Cadastro =====");
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        return new ContaBancaria(nome);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ContaBancaria[] listaDeContas = new ContaBancaria[3];
        for (int i = 0; i < listaDeContas.length; i++) {
            System.out.printf("======== %d° ========%n", i+1);
            listaDeContas[i] = cadastraConta(scanner);

            listaDeContas[i].depositar(100*i); // deposito de teste
            listaDeContas[i].saque(i);// saque de teste
        }

        System.out.println("===== Contas Cadastradas =====");
        for (ContaBancaria conta : listaDeContas) {
            conta.mostrarDados();
            System.out.println("=====");
        }
        scanner.close();
    }
}