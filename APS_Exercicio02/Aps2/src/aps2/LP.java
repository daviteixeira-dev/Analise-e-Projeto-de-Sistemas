package aps2;

public class LP extends Musica{
    
    private boolean raro;

    public LP(boolean raro, String autor, int numFaixas, String codigo, 
            String título, String genero, boolean locado){
        super(autor, numFaixas, codigo, título, genero, locado);
        this.raro = raro;
    }

    public boolean isRaro(){
        return raro;
    }

    public void setRaro(boolean raro){
        this.raro = raro;
    }
    
    @Override
    public double calcularDiaria(){
        return 0;
    }
}
