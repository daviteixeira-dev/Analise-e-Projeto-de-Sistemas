package aps2;

public class CD extends Musica{
   private boolean arranhado;
   private boolean duplo;

    public CD(boolean arranhado, boolean duplo, String autor, int numFaixas, 
            String codigo, String título, String genero, boolean locado){
        super(autor, numFaixas, codigo, título, genero, locado);
        this.arranhado = arranhado;
        this.duplo = duplo;
    }

    public boolean isArranhado(){
        return arranhado;
    }

    public void setArranhado(boolean arranhado){
        this.arranhado = arranhado;
    }

    public boolean isDuplo(){
        return duplo;
    }

    public void setDuplo(boolean duplo){
        this.duplo = duplo;
    }
   
   @Override
    public String toString(){
        return "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "autor: " + this.autor + "\n" +
            "numero de faixas: " + this.numFaixas + "\n" +
            "duplo: " + this.duplo + "\n" +
            "arranhado: " + this.arranhado + "\n" + 
            "locado: " + this.locado;
    }
    
   @Override
    public double calcularDiaria(){
        return 0;
    }
    
}
