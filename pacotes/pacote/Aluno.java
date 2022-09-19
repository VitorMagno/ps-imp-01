package pacotes.pacote;

public class Aluno extends Usuario{

    // protected enum tipoGrade{
        //     GRADUACAO, MESTRADO, DOUTORADO
        // };
    private String tipoGraduacao;
    public Aluno(String nome, String tipoGraduacao) {
        super(nome);
        this.tipoGraduacao = tipoGraduacao;
        //TODO Auto-generated constructor stub
    }
}
    