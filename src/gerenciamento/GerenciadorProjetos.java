package src.gerenciamento;

import java.sql.Date;
import java.util.ArrayList;

import src.projeto.Projeto;
import src.usuario.*;

public class GerenciadorProjetos {
    ArrayList<Projeto> projetos;
    private int id=0;
    // cria um projeto, coloca na lista de projetos e retorna o index desse projeto  
    public Projeto createProjeto(String identificacao, String descricao, Professor coordenador, int valorBolsa, Date dataHrInicio, Date dataHrTermino, Date vigenciaBolsa) {
        if(projetos == null) {
            projetos = new ArrayList<Projeto>();
        }
        this.id = id++;
        Projeto novoProjeto = new Projeto(this.id, identificacao, descricao, coordenador, valorBolsa, dataHrInicio, dataHrTermino, vigenciaBolsa);
        projetos.add(novoProjeto);
        int indexOfProjeto = projetos.lastIndexOf(novoProjeto);
        return projetos.get(indexOfProjeto);
    }
    public void listProjetos(){
        for (Projeto elem: projetos){
            System.out.println(elem);
        }
    }

}
