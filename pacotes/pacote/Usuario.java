package pacotes.pacote;
/**
 * Usuario
 */
public class Usuario {
    
    private String nome;
    //implementar enum cargo 
    public Usuario(String nome) {
        if(this.nome == "" || this.nome == null) {
            System.out.println("nome inválido");
            return;
        }
        this.nome = nome;
    }


}