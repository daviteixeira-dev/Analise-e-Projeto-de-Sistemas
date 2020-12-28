package aps2;

import java.util.HashMap;
import java.util.Map;

public class RepositorioDeProdutos{
    static Map<String, Produto> produtos = new HashMap<String, Produto>();
    
    public void addProduto(String codigo, Produto valor){
        produtos.put(codigo, valor);
    }
    
    public void removerProduto(String codigo){
        produtos.remove(codigo);
    }
    
    public Produto acharProduto(String codigo){
        return produtos.get(codigo);
    }

    public Map<String, Produto> getProdutos(){
        return produtos;
    }

    public void setProdutos(Map<String, Produto> produtos){
        RepositorioDeProdutos.produtos = produtos;
    }
}
