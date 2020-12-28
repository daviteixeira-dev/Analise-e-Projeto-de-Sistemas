package aps2;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RepositorioDeLocacao{
    static ArrayList<Locacao> locacao = new ArrayList();
    
    static Scanner ler = new Scanner(System.in);
    
    public ArrayList<Locacao> getLocacoes(){
        return locacao;
    }
    
    public void addLocacao(String codigo, String matricula){
        System.out.println("Qual a data de entrega do produto? ");
        Date dataEntrega = Date.from(Instant.MIN);
        dataEntrega.getTime();
        int diasLocados = ler.nextInt();
        dataEntrega.setTime(dataEntrega.getTime() + diasLocados);
        Locacao locado = new Locacao(codigo, matricula, dataEntrega);
        locacao.add(locado);
        System.out.println("Locação Realizada.");
    }
    
    public void removerLocacao(String codigo, String matricula){
        for(int i = 0; i < locacao.size(); i++){
            if(locacao.get(i).getCodigoProduto().equals(codigo) && 
                    locacao.get(i).getMatriculaCliente().equals(matricula)){
                locacao.remove(i);
                System.out.println("Locação removia!");
                return;
            }
        }
        System.out.println("Este produto não foi alocado.");
    }
    
    public Locacao acharLocacao(String codigo){
        for(int i = 0; i < locacao.size(); i++){
            if(locacao.get(i).getCodigoProduto().equals(codigo)){
                return locacao.get(i);
            }
        }
        System.out.println("Esse produto nao foi locado.");
        return null;
    }
}
