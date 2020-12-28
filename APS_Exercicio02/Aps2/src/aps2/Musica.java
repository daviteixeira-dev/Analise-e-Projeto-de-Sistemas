package aps2;

public abstract class Musica extends Produto{
    protected String autor;
    protected int numFaixas;

    public Musica(String autor, int numFaixas, String codigo, String título, 
            String genero, boolean locado){
        super(codigo, título, genero, locado);
        this.autor = autor;
        this.numFaixas = numFaixas;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNumFaixas(){
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas){
        this.numFaixas = numFaixas;
    }
    
    @Override
    public double calcularDiaria(){
        return 0;
    }
}