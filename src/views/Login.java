package src.views;

public abstract class Login {
    public void doLogin(){
        System.out.println("Faca o login para prosseguir");
    }
    public void doCreateUser(){
        System.out.println("Crie um usuario");
    }
    public void doWrongUser(){
        System.out.println("Usuario incorreto");
    }
    public void doWrongPassword(){
        System.out.println("Senha incorreta");
    }
    public void doForgetPassword(){
        System.out.println("Esqueceu a senha");
    }
}
