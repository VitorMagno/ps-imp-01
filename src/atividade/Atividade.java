package src.atividade;
/**
 * Atividade
 */

import java.util.ArrayList;
import java.util.Date;

import src.usuario.Profissional;
import src.usuario.Usuario;

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
    public void setProfissionais(Profissional profissionais) {
        this.profissionais.add(profissionais);
    }
    public void setTarefas(String tarefas) {
        this.tarefas.add(tarefas);
    }
    private void removeProfissional(String profissional) {
        if(this.profissionais.contains(profissional)) {
            int index = this.profissionais.indexOf(profissional);
            try {
                this.profissionais.remove(index);
            } catch (Exception e) {
                System.out.println(e);
            }
            return;
        }
        System.out.println("Not found");
    }
    private void removeTarefa(String tarefa) {
        if(this.tarefas.contains(tarefa)) {
            int index = this.tarefas.indexOf(tarefa);
            try {
                this.tarefas.remove(index);
            } catch (Exception e) {
                System.out.println(e);
            }
            return;
        }
        System.out.println("Not found");
    }
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
    @Override
    public String toString() {
        return "Atividade [id = "+ id +
                        ", \nidentificacao = " + identificacao +
                        ", dataHrInicio = " + dataHrInicio + ", \ndataHrTermino=" + dataHrTermino + 
                        ", \ndescricao = " + descricao + 
                        ", \nresponsavel = " + responsavel + 
                        ", \nprofissionais = "+profissionaisStr()+
                        ", \ntarefas = "+tarefasStr()+"]";
    }
    
}