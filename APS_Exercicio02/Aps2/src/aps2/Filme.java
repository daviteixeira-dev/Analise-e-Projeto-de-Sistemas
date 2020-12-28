package aps2;

public abstract class Filme extends Produto {
    protected int anoLancamento;
    protected int duracao;

    public Filme(int anoLancamento, int duracao, String codigo, String título, String genero, boolean locado) {
        super(codigo, título, genero, locado);
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao(){
        return duracao;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public String toString(){
        return "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "locado: " + this.locado + "\n" +
            "ano lancamento: " + this.anoLancamento + "\n" +
            "duracao (min): " + this.duracao + "\n";
    }
}