package davi.aps_exercicio01;

import java.util.ArrayList;

/* @author Davi Teixeira */

public class RevendaComArray{
    private ArrayList<Produto> produtos;
    private int indice;
    
    public RevendaComArray(int quantidade_de_produtos){
        this.produtos = new ArrayList<>(quantidade_de_produtos);
    }
    
    public void inserirProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void comprar(int codigo_do_produto, int quantidade_de_produtos){
        for(Produto novo : produtos){
            if(novo.Codigo_do_Produto() == codigo_do_produto){
                novo.compra(quantidade_de_produtos);
                System.out.println("Produto(os) comprado(os).");
                return;
            }
        }
        System.out.println("ERRO:Produto Indisponivel.");
    }
    
    public void vender(int codigo_do_produto, int quantidade_de_produtos){
        for(Produto escolhido : produtos){
            if(escolhido.Codigo_do_Produto() == codigo_do_produto){
                escolhido.venda(quantidade_de_produtos);
                System.out.println("Produto(os) vendido(os).");
                return;
            }
        }
        System.out.println("ERRO:Produto Indisponivel.");
    }
    
    public void consultaPrecoVenda(int codigo_do_produto){
        for(Produto consultar : produtos){
            if(consultar.Codigo_do_Produto() == codigo_do_produto){
                System.out.println("Valor do produto: "
                        + consultar.calculaPrecoVenda());
                return;
            }
        }
        System.out.println("ERRO:Nao temos esse Produto.");
    }
    
    public void listaPrecos(){
        for(Produto todos : produtos){
            System.out.println("Codigo: " + todos.Codigo_do_Produto()  
                    + " Nome: " + todos.Descricao_do_Produto() 
                    + " Valor: " + todos.calculaPrecoVenda());
        }
    }
    
    public Produto procurarProduto(int codigo_do_produto){
        for(Produto procurar : produtos){
            if(procurar.Codigo_do_Produto() == codigo_do_produto){
                return procurar;
            }
        }
        System.out.println("ERRO:Nao temos esse Produto.");
        return null;
    }
}