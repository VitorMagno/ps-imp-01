package pacotes.pacote;

public class Profissional extends Usuario {
    // protected enum cargo{
    //     TESTADOR, DESENVOLVEDOR, ANALISTA
    // };
    String cargo;

    public Profissional(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }
    
}
