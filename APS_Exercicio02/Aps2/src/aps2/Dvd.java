package aps2;

public class Dvd extends Filme{
    private boolean arranhado;

    public Dvd(boolean arranhado, int anoLancamento, int duracao, String codigo, 
            String título, String genero, boolean locado){
        super(anoLancamento, duracao, codigo, título, genero, locado);
        this.arranhado = arranhado;
    }

    public boolean isArranhado(){
        return arranhado;
    }

    public void setArranhado(boolean arranhado){
        this.arranhado = arranhado;
    }
    
    public String toString(){
        return "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "ano lancamento: " + this.anoLancamento + "\n" +
            "duracao (min): " + this.duracao + "\n" +
            "aranhado: " + this.arranhado + "\n" +
            "locado: " + this.locado + "\n";
    }
    
    public double calcularDiaria(){
        return 0;
    }
    
}
