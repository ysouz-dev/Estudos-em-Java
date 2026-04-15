package projetos.gerenciador_de_barbearia;

import projetos.gerenciador_de_barbearia.controller.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int escolha = Integer.MIN_VALUE;
        while (escolha != 0) {
            escolha = menu.MenuPrincipal();

            switch (escolha) {
                case 1:
                    menu.cadastrarCliente();
                    break;

                case 2:
                    menu.listarClientes();
                    break;

                case 0:
                    menu.encerrarSistema();
                    break;
            }
        }
    }
}
