import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteContaEspecial extends TesteContaCorrente{

    @BeforeEach
    public void inicializarConta(){
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }
    @Test
    public void saqueMaiorQueSaldo() {
        int valorSacado = cc.sacar(350);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado,0);
    }
    @Test
    public void saqueMaiorQueSaldoDentroLimite() {
        int valorSacado = cc.sacar(250);
        assertEquals(cc.saldo, -50);
        assertEquals(valorSacado,250);
    }
}
