import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    public void testeCarroParado() {
        Carro c = new Carro();
        assertEquals(0, c.getVelocidade());
    }


    @Test
    public void testAcelerar() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        assertEquals(10, c.velocidade);
    }
    @Test
    public void testFrear() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());
    }

    public void testFrearAteZerp() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }
}