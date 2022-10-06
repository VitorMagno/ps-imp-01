package src.gerenciamento;

import src.usuario.Usuario;
import src.gerenciamento.GerenciadorUsuarios;
public class GerenciadorLogin {
    GerenciadorUsuarios appUsers;
    public void login(Usuario user, String password) {
        for (Usuario elem: appUsers.getUsuarios()){
                if(user.getName() == elem.getName() && user.getPassword() == elem.getPassword()) {
                    System.out.println("logado em: " + user);
                }
        }
    }
    public void forgotPassword(Usuario user, int cpf, String newPassword) {
        for (Usuario elem: appUsers.getUsuarios()) {
            if(user.getName() == elem.getName() && user.getCpf() == elem.getCpf()) {
                user.setPassword(newPassword);
            }
        }
    }
}
