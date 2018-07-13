import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCarroMultiplica {

        CarroDeCorrida c;

        @BeforeEach
        public void inicializaCarro() {
            c = new CarroMultiplica("Test", 1.5, 100);
        }
        @Test
        public void testeCarroParado() {
            assertEquals(0, c.getVelocidade());
        }


        @Test
        public void testAcelerarUmaVez() {
            c.acelerar();
            assertEquals(10, c.getVelocidade());
        }
    @Test
    public void testAcelerarDuasVezes() {
        c.acelerar();
        c.acelerar();
        assertEquals(15, c.getVelocidade());
    }
        @Test
        public void testFrear() {
            c.acelerar();
            c.frear();
            assertEquals(5, c.getVelocidade());
        }

        public void testFrearAteZerp() {
            c.acelerar();
            c.frear();
            c.frear();
            c.frear();
            c.frear();
            assertEquals(0, c.getVelocidade());
        }
        @Test
        public void testAcelerarAteVelocidadeMax() {
            for (int i=0; i<14; i++);
            c.acelerar();
            assertEquals(10, c.getVelocidade());
        }
    }

