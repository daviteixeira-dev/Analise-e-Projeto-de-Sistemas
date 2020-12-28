package aps2;

public class Vhs extends Filme {
    private boolean cores;

    public Vhs(boolean cores, int anoLancamento, int duracao, String codigo, 
            String título, String genero, boolean locado){
        super(anoLancamento, duracao, codigo, título, genero, locado);
        this.cores = cores;
    }

    public boolean isCores(){
        return cores;
    }

    public void setCores(boolean cores){
        this.cores = cores;
    }
    
    @Override
    public String toString(){
        return "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "ano lancamento: " + this.anoLancamento + "\n" +
            "duracao (min): " + this.duracao + "\n" +
            "locado: " + this.locado + "\n";
    }
    
    @Override
    public double calcularDiaria(){
        return 0;
    }
}
