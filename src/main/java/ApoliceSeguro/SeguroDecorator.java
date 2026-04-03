package ApoliceSeguro;

public abstract class SeguroDecorator implements Seguro {
    private Seguro seguro;
    public String descricao;

    public SeguroDecorator(Seguro seguro) {
        this.seguro = seguro;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public abstract float getPercentualAcrescimo();

    public float getValor() {
        return this.seguro.getValor() * (1 + (this.getPercentualAcrescimo() / 100));
    }

    public abstract String getNomeCobertura();

    public String getDescricao() {
        return this.seguro.getDescricao() + "/" + this.getNomeCobertura();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
