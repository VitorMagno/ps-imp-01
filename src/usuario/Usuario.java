package src.usuario;
/**
 * Usuario
 */
public class Usuario {
    //implementar enum cargo 
    protected String nome;
    protected int cpf;
    protected String senha;
   
    public Usuario(String nome, int cpf, String Senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    public void setName(String nome) {
        this.nome = nome;
    }
    public String getName() {
        return this.nome;
    }
    public void setPassword(String senha) {
        this.senha = senha;
    }
    public String getPassword(){
        return this.senha;
    }
    public int getCpf(){
        return this.cpf;
    }
    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", cpf=" + cpf + "]";
    }

    
}