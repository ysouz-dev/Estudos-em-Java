/* Crie um sistema para representar veículos que possuem tipos de combustível e status de funcionamento. */
package exercicios.poo.heranca.exercicio100;

import exercicios.poo.heranca.exercicio100.Moto.PartidaEletrica;
import exercicios.poo.heranca.exercicio100.Veiculo.TipoCombustivel;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 50, 12, TipoCombustivel.GASOLINA, 4);
        Moto moto = new Moto("Yamaha", "R3", 14, 20, TipoCombustivel.GASOLINA, PartidaEletrica.SIM);
        Caminhao caminhao = new Caminhao("volvo", "fh", 300, 3, TipoCombustivel.DIESEL, 5000);

        ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
        listaVeiculos.add(carro);
        listaVeiculos.add(moto);
        listaVeiculos.add(caminhao);

        // executa varias acoes em cada veiculo
        for (Veiculo veiculo : listaVeiculos) {
            veiculo.ligar();
            System.out.println(veiculo.getModelo() + " acabou de ligar!");

            veiculo.mover();
            System.out.println(veiculo.getModelo() + " está se movendo!");

            veiculo.parar();
            System.out.println(veiculo.getModelo() + " acabou de parar.");

            veiculo.desligar();
            System.out.println(veiculo.getModelo() + " acabou de desligar.");

            veiculo.colocarEmManutencao();
            System.out.println(veiculo.getModelo() + " foi colocado em manutenção.");

            System.out.println("============ vv ==========");
            veiculo.exibirDados();
            System.out.println("===============================");
        }

        // testa ligar um veiculo em manutencao
        listaVeiculos.get(0).ligar();
    }
}
