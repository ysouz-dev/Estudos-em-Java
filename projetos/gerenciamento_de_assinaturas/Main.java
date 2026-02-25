package projetos.gerenciamento_de_assinaturas;

import projetos.gerenciamento_de_assinaturas.controller.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int escolha = 0;
        while (escolha != 8) {
            escolha = menu.iniciar();
            switch (escolha) {
                case 1:
                    menu.cadastrarCliente();
                    break;

                case 2:
                    menu.cadastrarPlano();
                    break;

                case 3:
                    menu.criarAssinatura();
                    break;

                case 4:
                    menu.cancelarAssinatura();
                    break;

                case 5:
                    menu.reativarAssinatura();
                    break;

                case 6:
                    menu.listarAssinaturasAtivas();
                    break;

                case 7:
                    menu.calcularFaturamentoMensal();
                    break;

                case 8:
                    System.out.println("Sistema encerrado!");
                    break;
            }
        }
    }
}