package src.models.entities.usuario;

public class Profissional extends Usuario {
    // protected enum cargo{
    //     TESTADOR, DESENVOLVEDOR, ANALISTA
    // };
    private String cargo;
    public Profissional(String nome, String cargo, int cpf, String senha) {
        super(nome, cpf, senha);
        this.cargo = cargo;
    }
    @Override
    public String toString() {
        return "Profissional [nome=" + nome + ", cpf=" + cpf + ", cargo="+ cargo +"]";
    }
    
}
