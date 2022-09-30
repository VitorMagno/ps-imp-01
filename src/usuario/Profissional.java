package src.usuario;

public class Profissional extends Usuario {
    // protected enum cargo{
    //     TESTADOR, DESENVOLVEDOR, ANALISTA
    // };
    private String cargo;
    public Profissional(String nome, int cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }
    
}
