package src.models.entities.projeto;

import java.util.ArrayList;
import java.util.Date;

import src.models.entities.atividade.Atividade;
import src.models.entities.usuario.Professor;
import src.models.entities.usuario.Profissional;
/**
 * Projeto
 */
public class Projeto {
    private int id;
    private int valorBolsa;
    
    private String nome;
    private String descricao;
    private String status;
    private Professor coordenador;

    private ArrayList<Profissional> profissionais;
    private ArrayList<Atividade> atividades;


    Date dataHrInicio;
    Date dataHrTermino;
    Date vigenciaBolsa;
    
    public Projeto(int id, String nome, String descricao, Professor coordenador, int valorBolsa, Date dataHrInicio, Date dataHrTermino, Date vigenciaBolsa) {
        if (nome == null || nome == ""){
            System.out.println("missing value nome");
            return;
        }
        if (descricao == null || descricao == ""){
            System.out.println("missing value descricao");
            return;
        }
        if (coordenador == null ){
            System.out.println("missing value coordenador");
            return;
        }
        if (((Object)valorBolsa).getClass().getSimpleName() != "Integer"){
            System.out.println("value valorBolsa is not Integer");
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
        if (vigenciaBolsa == null) {
            System.out.println("missing value vigenciaBolsa");
            return;
        }
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = "Iniciado";
        this.coordenador = coordenador;
        this.status = "Em processo de criacao";
        this.valorBolsa = valorBolsa;
        this.dataHrInicio = dataHrInicio;
        this.dataHrTermino = dataHrTermino;
        this.vigenciaBolsa = vigenciaBolsa;
    }
    //----------setters & getters--------//
    public int getId() {
        return id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        
        if(status == "concluido" && profissionais.isEmpty() && atividades.isEmpty()){
            System.out.println("projeto nao pode ser concluido");
            return;
        }

        this.status = status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }
    public Professor getCoordenador() {
        return this.coordenador;
    }

    public void setProfissionais(Profissional profissional) {
        this.profissionais.add(profissional);
    }
    public String getProfissionais() {
        return profissionaisStr();
    }

    public void setAtividades(Atividade atividade) {
        this.atividades.add(atividade);
    }
    public String getAtividades() {
        return atividadesStr();
    }

    public void setValorBolsa(int valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
    public int getValorBolsa() {
        return this.valorBolsa;
    }

    public void setDataHrInicio(Date dataHrInicio) {
        this.dataHrInicio = dataHrInicio;
    }
    public Date getDataHrInicio() {
        return dataHrInicio;
    }

    public void setDataHrTermino(Date dataHrTermino) {
        this.dataHrTermino = dataHrTermino;
    }
    public Date getDataHrTermino() {
        return dataHrTermino;
    }

    public void setVigenciaBolsa(Date vigenciaBolsa) {
        this.vigenciaBolsa = vigenciaBolsa;
    }
    public Date getVigenciaBolsa(){
        return vigenciaBolsa;
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

    private String atividadesStr() {
        StringBuilder stringBuilder = new StringBuilder("");
        
        for (Atividade atividade : this.atividades) {
            stringBuilder.append(atividade).append(" ");
        }
        
        return stringBuilder.toString();
    }

    //-----------public-----------//
    
    public ArrayList<Profissional> listaProfissionais() {
        return profissionais;
    }

    public void removeAtividade(Atividade atividade) {
        if(this.atividades.contains(atividade)) {
            int index = this.atividades.indexOf(atividade);
            
            try {
                this.atividades.remove(index);
            } catch (Exception e) {
                System.out.println(e);
            }
            
            System.out.println("Removed");
            return;
        }
        System.out.println("Not found");
    }

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

    @Override
    public String toString() {
        return "Projeto [id=" + id + ", \ncoordenador=" + coordenador + ", \ndataHrInicio=" + dataHrInicio + ", \ndataHrTermino="
                + dataHrTermino + ", \ndescricao=" + descricao + ", \nnome=" + nome + ", \nvalorBolsa="
                + valorBolsa + ", \nvigenciaBolsa=" + vigenciaBolsa + ", \nprofissionais=" + profissionaisStr()
                + ", \natividades" + atividadesStr()+ "]";
    }
}