package src.instituicao;

import java.util.ArrayList;
import java.util.Date;

import src.atividade.Atividade;
import src.usuario.*;

public class GerenciadorAtividades {
    private ArrayList<Atividade> atividades;
    int id=0;
    public void createAtividade(String identificacao, String descricao, Date dataHrInicio, Date dataHrTermino, Usuario responsavel) {
        if(atividades == null) {
            atividades = new ArrayList<Atividade>();
        }
        Atividade novaAtividade = new Atividade(id+1, identificacao, descricao, dataHrInicio, dataHrTermino, responsavel);
        atividades.add(novaAtividade);
    }
    public void getAtividade(){
        for (Atividade elem: atividades){
            System.out.println(elem);
        }
    }
}
