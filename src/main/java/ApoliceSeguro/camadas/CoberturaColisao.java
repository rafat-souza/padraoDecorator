package ApoliceSeguro.camadas;

import ApoliceSeguro.Seguro;
import ApoliceSeguro.SeguroDecorator;

public class CoberturaColisao extends SeguroDecorator {
    public CoberturaColisao(Seguro seguro) {
        super(seguro);
    }

    public float getPercentualAcrescimo() {
        return 20.0f;
    }

    public String getNomeCobertura() {
        return "Colisão";
    }
}
