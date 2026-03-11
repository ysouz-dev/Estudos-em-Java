/*Crie um Semáforo.
Status:
- VERDE
- AMARELO
- VERMELHO
Regras:
- Cada cor tem duração
- Método proximoEstado()
- Não pode pular ordem
- Deve mostrar tempo restante */

package exercicios.poo.enumeracao.exercicio91;

import exercicios.poo.enumeracao.exercicio91.Semaforo.Status;
import java.util.Scanner;

public class Main {

    public static int menuPrincipal(Semaforo semaforo, Scanner scanner) {
        System.out.println("----------------");
        System.out.println("Cor atual: " + semaforo.getStatus());

        if (semaforo.getStatus() == Status.VERMELHO) {
            System.out.println("Pare!!");
        } else if (semaforo.getStatus() == Status.AMARELO) {
            System.out.println("Reduza a velocidade!");
        } else {
            System.out.println("Prossiga!");
        }
        if (semaforo.tempoRestante() > 0) {
            System.out.println("Tempo restante: " + semaforo.tempoRestante() + " segundos");
        } else {
            System.out.println("Tempo restante: 0 segundos");
        }
        System.out.println("----------------");
        System.out.println("[ 1 ] Avançar estado do sinal");
        System.out.println("[ 2 ] Atualizar tempo restante");
        System.out.println("[ 0 ] Parar semáforo");
        System.out.println("----------------");
        int opcao;
        do {
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            if (opcao < 0 || opcao > 2) {
                System.out.println("Error: %d não é uma opção válida!".formatted(opcao));
            }
        } while (opcao < 0 || opcao > 2);
        return opcao;
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        Scanner scanner = new Scanner(System.in);

        int escolha = Integer.MIN_VALUE;
        while (escolha != 0) {
            escolha = menuPrincipal(semaforo, scanner);

            switch (escolha) {
                case 1:
                    semaforo.proximoEstado();
                    break;

                case 2:
                    continue;

                case 0:
                    System.out.println("Semáforo encerrado.");
                    break;
            }
        }
    }
}
