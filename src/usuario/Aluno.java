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
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", cpf=" + cpf +", tipoGraduacao=" + tipoGraduacao + "]";
    }
}
    