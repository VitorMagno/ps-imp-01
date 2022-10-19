package src.models.entities.atividade;
/**
 * Atividade
 */

import java.util.ArrayList;
import java.util.Date;

import src.models.entities.usuario.Profissional;
import src.models.entities.usuario.Usuario;

public class Atividade {
    int id;
    String identificacao;
    String descricao;
    String profissionaisString;
    String tarefasString;

    Date dataHrInicio;
    Date dataHrTermino;

    Usuario responsavel;

    ArrayList<Profissional> profissionais;
    ArrayList<String> tarefas;
    
    public Atividade(int id, String identificacao, String descricao, Date dataHrInicio, Date dataHrTermino, Usuario responsavel) {
        if (identificacao == null || identificacao == ""){
            System.out.println("missing value identificacao");
            return;
        }
        if (descricao == null || descricao == ""){
            System.out.println("missing value descricao");
            return;
        }
        if (dataHrInicio == null) {
            System.out.println("missing value dataHrInicio");
            return;
        }
        if (dataHrTermino == null) {
            System.out.println("missing value dataHrTermino");
            return;
        }
        if (responsavel == null || responsavel.toString() == "") {
            System.out.println("missing value responsavel");
            return;
        }
        this.id = id;
        this.identificacao = identificacao;
        this.descricao = descricao;
        this.dataHrInicio = dataHrInicio;
        this.dataHrTermino = dataHrTermino;
        this.responsavel = responsavel;
    }
    //----------setters & getters--------//
    public int getId() {
        return id;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return this.identificacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }

    public void setProfissionais(Profissional profissionais) {
        this.profissionais.add(profissionais);
    }
    public String getProfissionais() {
        return this.profissionaisStr();
    }

    public void setTarefas(String tarefas) {
        this.tarefas.add(tarefas);
    }

    public String getTarefas() {
        return this.tarefasStr();
    }
    
    //----------metodos----------//
    //----------private----------//
    
    private String profissionaisStr() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Profissional profissional : this.profissionais) {
            stringBuilder.append(profissional).append(" ");
        }
        return stringBuilder.toString();
    }
    private String tarefasStr() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (String tarefa : this.tarefas) {
            stringBuilder.append(tarefa).append(" ");
        }
        return stringBuilder.toString();
    }
    //----------public----------//
    public void removeProfissional(Profissional profissional) {
        if(this.profissionais.contains(profissional)) {
            int index = this.profissionais.indexOf(profissional);
            try {
                this.profissionais.remove(index);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Removed");
            return;
        }
        System.out.println("Not found");
    }
    public void removeTarefa(String tarefa) {
        if(this.tarefas.contains(tarefa)) {
            int index = this.tarefas.indexOf(tarefa);
            try {
                this.tarefas.remove(index);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Removed");
            return;
        }
        System.out.println("Not found");
    }
    @Override
    public String toString() {
        return "Atividade [id = " + id +
                        ", \nidentificacao = " + identificacao +
                        ", dataHrInicio = " + dataHrInicio + ", \ndataHrTermino=" + dataHrTermino + 
                        ", \ndescricao = " + descricao + 
                        ", \nresponsavel = " + responsavel + 
                        ", \nprofissionais = "+profissionaisStr()+
                        ", \ntarefas = "+tarefasStr()+"]";
    }
    
}