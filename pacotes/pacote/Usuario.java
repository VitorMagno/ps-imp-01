package pacotes.pacote;
/**
 * Usuario
 */
public class Usuario {
    
    protected String nome;
    //implementar enum cargo 
    public Usuario(String nome) {
        if(this.nome == "" || this.nome == null) {
            System.out.println("nome inválido");
            return;
        }
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}