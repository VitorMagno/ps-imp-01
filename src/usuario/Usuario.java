package src.usuario;
/**
 * Usuario
 */
public class Usuario {
    //implementar enum cargo 
    protected String nome;
    protected int cpf;
    public Usuario(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", cpf=" + cpf + "]";
    }

    
}