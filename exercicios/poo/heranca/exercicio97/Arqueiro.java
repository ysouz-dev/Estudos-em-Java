package exercicios.poo.heranca.exercicio97;

public class Arqueiro extends Personagem {
    private int ataqueDistancia;
    private int flechas;
    private boolean arcoCarregado;

    public Arqueiro(String nome) {
        super(nome);
        this.ataqueDistancia = 14;
        this.flechas = 3;
        this.arcoCarregado = true;
    }

    @Override
    public void atacar(Personagem personagem) {
        if (!this.arcoCarregado) {
            throw new IllegalStateException("O arco precisa ser recarregado!");
        }

        super.atacar(personagem);
        reduzirVida(ataqueDistancia);
        this.flechas--;

        if (this.flechas == 0) {
            this.arcoCarregado = false;
        }
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Ataque à distância: " + this.ataqueDistancia);
        System.out.println("Flechas: " + this.flechas);
    }

    public void recarregarArco() {
        if (this.arcoCarregado) {
            throw new IllegalStateException("O arco já está carregado!");
        }
        this.flechas = 3;
        this.arcoCarregado = true;
    }
}
