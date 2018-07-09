package outro;

import pacote.Referencia;

public class OutraClasse {

    public void testeDeAcesso() {
        Referencia r = new Referencia();

//        Para classes oriundas de outro pacote, somente as variáveis com modificador "public" são visíveis.
        //r.modificadorDefault = 0;
        r.modificadorPublico = 0;
        //r.modificadorProtegido = 0;
        //r.modificadorPrivado = 0;
    }
}
