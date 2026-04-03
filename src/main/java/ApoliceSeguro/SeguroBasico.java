package ApoliceSeguro;

public class SeguroBasico implements Seguro {
    public float valorBase;

    public SeguroBasico() {
    }

    public SeguroBasico(float valorBase) {
        this.valorBase = valorBase;
    }

    public float getValor() {
        return valorBase;
    }

    public String getDescricao() {
        return "Seguro Básico";
    }
}
