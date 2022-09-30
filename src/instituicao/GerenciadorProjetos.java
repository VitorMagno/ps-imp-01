package src.instituicao;

import java.sql.Date;
import java.util.ArrayList;

import src.projeto.Projeto;
import src.usuario.*;

public class GerenciadorProjetos {
    ArrayList<Projeto> projetos;
    private int id=0;
    public void createProjeto(int id, String identificacao, String descricao, Professor coordenador, int valorBolsa, Date dataHrInicio, Date dataHrTermino, Date vigenciaBolsa) {
        if(projetos == null) {
            projetos = new ArrayList<Projeto>();
        }
        Projeto novoProjeto = new Projeto(id+1, identificacao, descricao, coordenador, valorBolsa, dataHrInicio, dataHrTermino, vigenciaBolsa);
        projetos.add(novoProjeto);
    }
    public void getProjeto(){
        for (Projeto elem: projetos){
            System.out.println(elem);
        }
    }

}
