package src.controller.gerenciamento;

import java.sql.Date;
import java.util.ArrayList;

import src.models.entities.projeto.Projeto;
import src.models.entities.usuario.*;

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

    public void removeProjetoById(int id) {
        for (Projeto elem: projetos){

            if(elem.getId() == id){
                projetos.remove(elem);
            }else{
                System.out.println("projeto não existente");
            }
        }
    }

    public void listProjetos(){

        for (Projeto elem: projetos){
            System.out.println(elem);
        }
    }

    public Projeto getProjetoById(int idProjeto) {
        for(Projeto elem: projetos){
            if(elem.getId() != idProjeto) {
                continue;
            }
            return elem;
        }
        return null;
    }

    public void changeStatus (Projeto projeto, Professor user) {
        if(user.getClass().getName() != "Professor" || user.getClass().getName() != "Pesquisador") {
            System.out.println("invalid user");
            return;
        }
        if(projeto.getStatus() == "Em processo de criacao") {
            projeto.setStatus("Iniciado");
            return;
        }
        if(projeto.getStatus() == "Iniciado") {
            projeto.setStatus("Em andamento");
            return;
        }
        if(projeto.getStatus() == "Em andamento") {
            projeto.setStatus("Concluido");
            return;
        }
    }

}
