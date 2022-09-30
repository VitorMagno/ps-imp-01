package src.usuario;

public class Aluno extends Usuario{

    // protected enum tipoGrade{
        //     GRADUACAO, MESTRADO, DOUTORADO
        // };
    private String tipoGraduacao;
    public Aluno(String nome, int cpf, String tipoGraduacao) {
        super(nome, cpf);
        this.tipoGraduacao = tipoGraduacao;
    }
}
    