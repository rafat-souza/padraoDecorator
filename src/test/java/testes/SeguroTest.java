package testes;

import ApoliceSeguro.Seguro;
import ApoliceSeguro.SeguroBasico;
import ApoliceSeguro.camadas.CarroReserva;
import ApoliceSeguro.camadas.CoberturaColisao;
import ApoliceSeguro.camadas.CoberturaRoubo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeguroTest {
    @Test
    void deveRetornarValorEDescricaoSeguroBasico() {
        Seguro seguro = new SeguroBasico(1000.0f);

        assertEquals(1000.0f, seguro.getValor());
        assertEquals("Seguro Básico", seguro.getDescricao());
    }

    @Test
    void deveRetornarValorEDescricaoSeguroComRoubo() {
        Seguro seguro = new CoberturaRoubo(new SeguroBasico(1000.0f));

        assertEquals(1150.0f, seguro.getValor(), 0.01f);
        assertEquals("Seguro Básico/Roubo e Furto", seguro.getDescricao());
    }

    @Test
    void deveRetornarValorEDescricaoSeguroComColisao() {
        Seguro seguro = new CoberturaColisao(new SeguroBasico(1000.0f));

        assertEquals(1200.0f, seguro.getValor(), 0.01f);
        assertEquals("Seguro Básico/Colisão", seguro.getDescricao());
    }

    @Test
    void deveRetornarValorEDescricaoSeguroComCarroReserva() {
        Seguro seguro = new CarroReserva(new SeguroBasico(1000.0f));

        assertEquals(1050.0f, seguro.getValor(), 0.01f);
        assertEquals("Seguro Básico/Carro Reserva", seguro.getDescricao());
    }

    @Test
    void deveRetornarValorEDescricaoSeguroComRouboEColisao() {
        Seguro seguro = new CoberturaColisao(new CoberturaRoubo(new SeguroBasico(1000.0f)));

        assertEquals(1380.0f, seguro.getValor(), 0.01f);
        assertEquals("Seguro Básico/Roubo e Furto/Colisão", seguro.getDescricao());
    }

    @Test
    void deveRetornarValorEDescricaoSeguroComRouboECarroReserva() {
        Seguro seguro = new CarroReserva(new CoberturaRoubo(new SeguroBasico(1000.0f)));

        assertEquals(1207.5f, seguro.getValor(), 0.01f);
        assertEquals("Seguro Básico/Roubo e Furto/Carro Reserva", seguro.getDescricao());
    }

    @Test
    void deveRetornarValorEDescricaoSeguroComColisaoECarroReserva() {
        Seguro seguro = new CarroReserva(new CoberturaColisao(new SeguroBasico(1000.0f)));

        assertEquals(1260.0f, seguro.getValor(), 0.01f);
        assertEquals("Seguro Básico/Colisão/Carro Reserva", seguro.getDescricao());
    }

    @Test
    void deveRetornarValorEDescricaoSeguroComTodasAsCoberturas() {
        Seguro seguro = new CarroReserva(
                new CoberturaColisao(
                        new CoberturaRoubo(
                                new SeguroBasico(1000.0f))));

        assertEquals(1449.0f, seguro.getValor(), 0.01f);
        assertEquals("Seguro Básico/Roubo e Furto/Colisão/Carro Reserva", seguro.getDescricao());
    }
}
