package src.models.entities.usuario;

public class Aluno extends Usuario{

    // protected enum tipoGrade{
    //     GRADUACAO, MESTRADO, DOUTORADO
    //};
    private String tipoGraduacao;
    public Aluno(String nome, String tipoGraduacao, int cpf, String senha) {
        super(nome, cpf, senha);
        this.tipoGraduacao = tipoGraduacao;
    }
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", cpf=" + cpf +", tipoGraduacao=" + tipoGraduacao + "]";
    }
}
    