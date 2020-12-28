package aps2;

public class Funcionario extends Pessoa{
    private String login;
    private String senha;

    public Funcionario(String login, String senha, String nome, int matricula){
        super(nome, matricula);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}
