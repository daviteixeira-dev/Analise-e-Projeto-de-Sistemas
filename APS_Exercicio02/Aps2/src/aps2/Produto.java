package aps2;

public abstract class Produto{
    protected String codigo;
    protected String titulo;
    protected String genero;
    protected boolean locado;
    
    public Produto(String codigo, String título, String genero, boolean locado){
        this.codigo = codigo;
        this.titulo = título;
        this.genero = genero;
        this.locado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTítulo() {
        return titulo;
    }

    public void setTítulo(String título) {
        this.titulo = título;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }
  
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", titulo=" + titulo + ", genero=" + genero + ", locado=" + locado + '}';
    }
    
   public abstract double calcularDiaria();
    
}


