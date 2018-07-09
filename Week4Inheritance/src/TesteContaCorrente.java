import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteContaCorrente {

    ContaCorrente cc;

    @BeforeEach
    public void inicializarConta(){
        cc = new ContaCorrente();
        cc.depositar(200);
    }
    @Test
    public void deposito() {
        assertEquals(cc.saldo, 200);
    }

    @Test
    public void saque() {
        int valorSacado = cc.sacar(50);
        assertEquals(cc.saldo, 150);
        assertEquals(valorSacado, 50);
    }

    @Test
    public void saqueMaiorQueSaldo() {
        int valorSacado = cc.sacar(250);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado,0);
    }

}
