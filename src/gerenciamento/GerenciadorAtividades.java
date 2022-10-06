package src.gerenciamento;

import java.util.ArrayList;
import java.util.Date;

import src.atividade.Atividade;
import src.usuario.*;

public class GerenciadorAtividades {
    private ArrayList<Atividade> atividades;
    int id=0;
    // cria uma atividade, coloca na lista de atividades e retorna o index dessa atividade  
    public Atividade createAtividade(String identificacao, String descricao, Date dataHrInicio, Date dataHrTermino, Usuario responsavel) {
        if(atividades == null) {
            atividades = new ArrayList<Atividade>();
        }
        this.id = id++;
        Atividade novaAtividade = new Atividade(id, identificacao, descricao, dataHrInicio, dataHrTermino, responsavel);
        atividades.add(novaAtividade);
        int indexOfAtividade = atividades.lastIndexOf(novaAtividade);
        return atividades.get(indexOfAtividade);
    }
    public void listAtividades(){
        for (Atividade elem: atividades){
            System.out.println(elem);
        }
    }
}
