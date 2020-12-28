package aps2;

public class BluRay extends Filme{
    private String[] idiomas = new String[2];
    private boolean arranhado;

    public BluRay(String[] idiomas, boolean arranhado, int anoLancamento, 
            int duracao, String codigo, String título, 
            String genero, boolean locado){
        super(anoLancamento, duracao, codigo, título, genero, locado);
        this.idiomas = idiomas;
        this.arranhado = arranhado;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public boolean isArranhado() {
        return arranhado;
    }

    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }
    
    @Override
    public String toString(){
        return "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "ano lancamento: " + this.anoLancamento + "\n" +
            "duracao (min): " + this.duracao + "\n" +
            "idiomas: " + this.idiomas + "\n" +
            "aranhado: " + this.arranhado + "\n" +
            "locado: " + this.locado + "\n";
    }
    
    @Override
    public double calcularDiaria(){
        return 0;
    }
    
}
