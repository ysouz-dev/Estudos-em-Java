package exercicios.poo.encapsulamento.exercicio82;

public class Cofre {
    private String senha;
    private boolean aberto;

    public Cofre(String senha) {
        this.senha = senha;
    }

    public static boolean validaSenha(String senha) {
        if (senha.length() < 8) { 
            return false;
        }
        return true; 
    }
}
