import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;


public class TesteAutenticador {

    @Test
    public void loginComSucesso() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("guerra", "senhadoguerra");
        assertEquals("guerra", u.getLogin());
    }

    @Test
    public void loginFalha() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("guerra", "senhadoguerra");
    }


    @Test
    public void informacaoDoErro() {
        Autenticador a = new Autenticador();
        try {
            Usuario u = a.logar("guerra", "senhaerradadoguerra");
            fail();
        } catch (LoginException e) {
            assertEquals("guerra", e.getLogin());
        }
    }
}