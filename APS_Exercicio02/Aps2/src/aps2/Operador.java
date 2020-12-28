package aps2;

import java.util.ArrayList;

public class Operador extends Funcionario{
    
    public ArrayList <Cliente> cliente;
    public ArrayList <Locacao> locacao;
    public ArrayList <Produto> produto;

    public Operador(String login, String senha, String nome, int matricula){
        super(login, senha, nome, matricula);
        this.cliente = new ArrayList <>();
        this.locacao = new ArrayList <>();
        this.produto = new ArrayList <>();
    }
    
    public void fazerLocacao(){};
    
    public void excluirLocacao(){};
    
    public void fazerBaixa(){};
    
    public void procurarProduto(){};
    
    public void procurarCliente(){};
    
    
 }
