package pacotes.pacote;

import java.util.ArrayList;
import java.util.Date;
/**
 * Projeto
 */
public class Projeto {

    String identificacao;
    String descricao;
    String coordenador;

    ArrayList<String> profissionais;
    ArrayList<String> atividades;

    int valorBolsa;

    Date dataHrInicio;
    Date dataHrTermino;
    Date vigenciaBolsa;
    
    public Projeto(String identificacao, String descricao, String coordenador, int valorBolsa, Date dataHrInicio,
            Date dataHrTermino, Date vigenciaBolsa) {
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
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    public void setProfissionais(String profissionais) {
        this.profissionais.add(profissionais);
    }
    public void setAtividades(String atividades) {
        this.atividades.add(atividades);
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
        for (String profissional : this.profissionais) {
            stringBuilder.append(profissional).append(" ");
        }
        return stringBuilder.toString();
    }
    private String atividadesStr() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (String atividade : this.atividades) {
            stringBuilder.append(atividade).append(" ");
        }
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "Projeto [coordenador=" + coordenador + ", \ndataHrInicio=" + dataHrInicio + ", \ndataHrTermino="
                + dataHrTermino + ", \ndescricao=" + descricao + ", \nidentificacao=" + identificacao + ", \nvalorBolsa="
                + valorBolsa + ", \nvigenciaBolsa=" + vigenciaBolsa + ", \nprofissionais=" + profissionaisStr()
                + ", \natividades" + atividadesStr()+ "]";
    }


}