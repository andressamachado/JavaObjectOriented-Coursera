import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteCarroSoma {

    CarroSoma c;

    @BeforeEach
    public void inicializaCarro() {
        c = new CarroSoma("Test", 10, 100);
    }
        @Test
        public void testeCarroParado() {
            assertEquals(0, c.getVelocidade());
        }


        @Test
        public void testAcelerar() {
            c.acelerar();
            assertEquals(10, c.getVelocidade());
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
