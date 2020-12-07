package davi.aps_exercicio01;

/* @author Davi Teixeira */

public class Produto{
    private int codigo_do_produto;
    private double valor_de_compra;
    /* Margem de lucro desejada, utilizado para calcular
    o preço de venda do produto. */
    private double margem_de_lucro;
    // Custo para armazenar e/ou bonificar o produto;
    private double custo_do_produto;
    private int quantidade_em_estoque;
    private String descricao_do_produto;
    
    public Produto(int codigo_do_produto, String descricao_do_produto){
        this.codigo_do_produto = codigo_do_produto;
        this.descricao_do_produto = descricao_do_produto;
    }
    
    public Produto(
            int codigo_do_produto,
            String descricao_do_produto,
            double valor_de_compra,
            double custo_do_produto,
            double margem_de_lucro
    ){
        this.margem_de_lucro = margem_de_lucro;
        this.valor_de_compra = valor_de_compra;
        this.custo_do_produto = custo_do_produto;
        this.codigo_do_produto = codigo_do_produto;
        this.descricao_do_produto = descricao_do_produto;
    }
    
    public Produto(
            int codigo_do_produto,
            String descricao_do_produto,
            double valor_de_compra,
            double custo_do_produto,
            double margem_de_lucro,
            int quantidade_em_estoque
    ){
        this.margem_de_lucro = margem_de_lucro;
        this.valor_de_compra = valor_de_compra;
        this.custo_do_produto = custo_do_produto;
        this.codigo_do_produto = codigo_do_produto;
        this.descricao_do_produto = descricao_do_produto;
        this.quantidade_em_estoque = quantidade_em_estoque;
    }
    
    public void compra(int quantidade){
        this.quantidade_em_estoque = quantidade_em_estoque + quantidade;
    }
    
    public void venda(int quantidade){
        this.quantidade_em_estoque = quantidade_em_estoque - quantidade;
    }
    
    public double calculaPrecoVenda(){
        return valor_de_compra
               + custo_do_produto
               + margem_de_lucro*(valor_de_compra + custo_do_produto);
    }
    
    public double getValor_de_Compra(){
        return valor_de_compra;
    }
    
    public void setValor_de_Compra(double valor_de_compra){
        this.valor_de_compra = valor_de_compra;
    }
    
    public double getCusto_do_Produto(){
        return custo_do_produto;
    }
    
    public void setCusto_do_Produto(double custo_do_produto){
        this.custo_do_produto = custo_do_produto;
    }
    
    public double getMargem_de_Lucro(){
        return margem_de_lucro;
    }
    
    public void setMargem_de_Lucro(double margem_de_lucro){
        this.margem_de_lucro = margem_de_lucro;
    }
    
    public int Codigo_do_Produto(){
        return codigo_do_produto;
    }
    
    public int Quantidade_em_Estoque(){
        return quantidade_em_estoque;
    }
    
    public String Descricao_do_Produto(){
        return descricao_do_produto;
    }
}