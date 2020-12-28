package aps2;

import java.util.Date;

public class Locacao extends Produto{
    private String codigoProduto;
    private String matriculaCliente;
    Date dateSaida;
    Date dataEntrega;
    Date devolucao;

    public Locacao(String codigoProduto, String matriculaCliente, Date dateSaida, Date dataEntrega, Date devolucao, String codigo, String título, String genero, boolean locado){
        super(codigo, título, genero, locado);
        this.codigoProduto = codigoProduto;
        this.matriculaCliente = matriculaCliente;
        this.dateSaida = dateSaida;
        this.dataEntrega = dataEntrega;
        this.devolucao = devolucao;
    }

    public String getCodigoProduto(){
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto){
        this.codigoProduto = codigoProduto;
    }

    public String getMatriculaCliente(){
        return matriculaCliente;
    }

    public void setMatriculaCliente(String matriculaCliente){
        this.matriculaCliente = matriculaCliente;
    }

    public Date getDateSaida(){
        return dateSaida;
    }

    public void setDateSaida(Date dateSaida){
        this.dateSaida = dateSaida;
    }

    public Date getDataEntrega(){
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega){
        this.dataEntrega = dataEntrega;
    }

    public Date getDevolucao(){
        return devolucao;
    }

    public void setDevolucao(Date devolucao){
        this.devolucao = devolucao;
    }
    
    public double calcularMultas(){
        return 0;
    };

    @Override
    public double calcularDiaria(){
        //To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
