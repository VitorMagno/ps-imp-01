package src.models.entities.usuario;

public class Professor extends Usuario {
    String unidadeAcademica;
    public Professor(String nome, String unidadeAcademica, int id, int cpf, String senha) {
        super(nome, id, cpf, senha);
        this.unidadeAcademica = unidadeAcademica;
    }
    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", cpf=" + cpf + ", unidadeAcademica=" + unidadeAcademica + "]";
    }
    
}
