package davi.aps_exercicio01;

import java.util.Scanner;

/* @author Davi Teixeira */

public class Main{
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        RevendaComArray revender = new RevendaComArray(0);
        
        while(true){
            
            String comando = ler.nextLine();
            String[] ui = comando.split(" ");
            System.out.println("$"+ comando);
            
            if(ui[0].equals("Inserir")){
                revender.inserirProduto(new Produto(Integer.parseInt(ui[1]), ui[2], Double.parseDouble(ui[3]), Double.parseDouble(ui[4]), Double.parseDouble(ui[5]), Integer.parseInt(ui[6])));
            }else if(ui[0].equals("Comprar")){
                revender.comprar(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("Vender")){
                revender.vender(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("Consultar")){
                revender.consultaPrecoVenda(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("Listar")){
                revender.listaPrecos();
            }else if(ui[0].equals("Alterar_Valor")){
                revender.procurarProduto(Integer.parseInt(ui[1])).setValor_de_Compra(Double.parseDouble(ui[2]));
            }else if(ui[0].equals("Alterar_Custo")){
                revender.procurarProduto(Integer.parseInt(ui[1])).setCusto_do_Produto(Double.parseDouble(ui[2]));
            }else if(ui[0].equals("Alterar_Lucro")){
                revender.procurarProduto(Integer.parseInt(ui[1])).setMargem_de_Lucro(Double.parseDouble(ui[2]));
            }else{
                break;
            }
        }
    }
}