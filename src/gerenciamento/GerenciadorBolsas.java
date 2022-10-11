package src.gerenciamento;

import java.util.ArrayList;
import java.util.Date;

import src.projeto.Projeto;
import src.usuario.Profissional;

public class GerenciadorBolsas {
    public void pagarBolsa(Projeto projeto) {
        Date vigenciaBolsa = projeto.getVigenciaBolsa();
        Date nowDate = new Date();
        if(nowDate.after(vigenciaBolsa)) {
            System.out.println("bolsa nao está mais vigente");
        }
        else {
            ArrayList<Profissional> profissionais = projeto.listaProfissionais();
            for (Profissional elem: profissionais) {
                System.out.println("pagando os profissionais" + elem);
            }
        }
    }
}
