package ApoliceSeguro.camadas;

import ApoliceSeguro.Seguro;
import ApoliceSeguro.SeguroDecorator;

public class CoberturaRoubo extends SeguroDecorator {
    public CoberturaRoubo(Seguro seguro) {
        super(seguro);
    }

    public float getPercentualAcrescimo() {
        return 15.0f;
    }

    public String getNomeCobertura() {
        return "Roubo e Furto";
    }
}
