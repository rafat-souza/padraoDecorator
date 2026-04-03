package ApoliceSeguro.camadas;

import ApoliceSeguro.Seguro;
import ApoliceSeguro.SeguroDecorator;

public class CarroReserva extends SeguroDecorator {
    public CarroReserva(Seguro seguro) {
        super(seguro);
    }

    public float getPercentualAcrescimo() {
        return 5.0f;
    }

    public String getNomeCobertura() {
        return "Carro Reserva";
    }
}
