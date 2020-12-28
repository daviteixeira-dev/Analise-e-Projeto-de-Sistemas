package aps2;

import java.util.ArrayList;

public class Gerente extends Funcionario{
    public ArrayList <Cliente> cliente;
    public ArrayList <Produto> produto;
    public ArrayList <Operador> operador;
    
    public Gerente(String login, String senha, String nome, int matricula) {
        super(login, senha, nome, matricula);
        this.cliente = new ArrayList <>();
        this.produto = new ArrayList <>();
        this.operador = new ArrayList <>();
    }
    
    //mecher aqui
    public void addCliente(String endereco, int idade, String nome){
        
    }
    
    //mecher aqui
    public void addProduto(){
        
    }
    
    //mecher aqui
    public void addOperador(){
        
    }
    
    //mecher aqui
    public void listar(){
        
    }
    
    //mecher aqui
    public void buscar(){
        
    }

    private static class ArrayLista<T> {

        public ArrayLista(){
            
        }
    }
     
}
