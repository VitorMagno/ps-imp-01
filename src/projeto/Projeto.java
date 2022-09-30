package src.projeto;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import src.atividade.Atividade;
import src.usuario.Professor;
import src.usuario.Profissional;
/**
 * Projeto
 */
public class Projeto {
    private int id;
    private int valorBolsa;
    
    private String identificacao;
    private String descricao;
    private Professor coordenador;

    private ArrayList<Profissional> profissionais;
    private ArrayList<Atividade> atividades;


    Date dataHrInicio;
    Date dataHrTermino;
    Date vigenciaBolsa;
    
    public Projeto(int id, String identificacao, String descricao, Professor coordenador, int valorBolsa, Date dataHrInicio, Date dataHrTermino, Date vigenciaBolsa) {
        this.id = id;
        this.identificacao = identificacao;
        this.descricao = descricao;
        this.coordenador = coordenador;
        this.valorBolsa = valorBolsa;
        this.dataHrInicio = dataHrInicio;
        this.dataHrTermino = dataHrTermino;
        this.vigenciaBolsa = vigenciaBolsa;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    public String getIdentificacao() {
        return identificacao;
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
    public void removeAtividade(Atividade atividade) {
        if(this.atividades.contains(atividade)) {
            int index = this.atividades.indexOf(atividade);
            try {
                this.atividades.remove(index);
            } catch (Exception e) {
                System.out.println(e);
            }
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
            return;
        }
        System.out.println("Not found");
    }

    @Override
    public String toString() {
        return "Projeto [coordenador=" + coordenador + ", \ndataHrInicio=" + dataHrInicio + ", \ndataHrTermino="
                + dataHrTermino + ", \ndescricao=" + descricao + ", \nidentificacao=" + identificacao + ", \nvalorBolsa="
                + valorBolsa + ", \nvigenciaBolsa=" + vigenciaBolsa + ", \nprofissionais=" + profissionaisStr()
                + ", \natividades" + atividadesStr()+ "]";
    }


}