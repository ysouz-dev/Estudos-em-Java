package exercicios.poo.encapsulamento.exercicio82;

public class Cofre {
    private String senha;
    private boolean aberto;

    public Cofre(String senha) {
        if (!validaSenha(senha)) {
            throw new IllegalArgumentException("A senha deve conter no mínimo 8 dígitos.");
        }

        this.senha = senha;
        this.aberto = false;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public boolean abrirCofre(String senhaDoCofre) {
        if (this.aberto) return false;
        
        if (senhaDoCofre.equals(this.senha)) {
            this.aberto = true;
            return true;
        }
        return false;
    }

    public boolean fecharCofre() {
        if (!this.aberto) return false;
        this.aberto = false;
        return true;
    }

    public static boolean validaSenha(String senha) {
        if (senha.length() < 8) { 
            return false;
        }
        return true; 
    }
}
