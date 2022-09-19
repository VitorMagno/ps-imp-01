package pacotes.pacote;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 * Projeto
 */
public class Projeto {

    String identificacao;
    String descricao;
    String coordenador;

    ArrayList<Profissional> profissionais;
    ArrayList<Atividade> atividades;

    int valorBolsa;

    Date dataHrInicio;
    Date dataHrTermino;
    Date vigenciaBolsa;
    
    public Projeto(String identificacao, String descricao, String coordenador, int valorBolsa, Date dataHrTermino, Date vigenciaBolsa) {

        this.identificacao = identificacao;
        this.descricao = descricao;
        this.coordenador = coordenador;
        this.valorBolsa = valorBolsa;
        this.dataHrInicio = new Date();
        this.dataHrTermino = dataHrTermino;
        this.vigenciaBolsa = vigenciaBolsa;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    public void setProfissionais(Profissional profissional) {
        this.profissionais.add(profissional);
    }
    public void setAtividades(Atividade atividade) {
        this.atividades.add(atividade);
    }
    public void setValorBolsa(int valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
    public void setDataHrInicio(Date dataHrInicio) {
        this.dataHrInicio = dataHrInicio;
    }
    public void setDataHrTermino(Date dataHrTermino) {
        this.dataHrTermino = dataHrTermino;
    }
    public void setVigenciaBolsa(Date vigenciaBolsa) {
        this.vigenciaBolsa = vigenciaBolsa;
    }
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
    private void removeAtividade(Atividade atividade) {
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
    private void removeProfissional(Profissional profissional) {
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