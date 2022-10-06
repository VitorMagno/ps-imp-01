package src.usuario;

public class Professor extends Usuario {
    String unidadeAcademica;
    public Professor(String nome, String unidadeAcademica, int cpf) {
        super(nome, cpf);
        this.unidadeAcademica = unidadeAcademica;
    }
    
}
