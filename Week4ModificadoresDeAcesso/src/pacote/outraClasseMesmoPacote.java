package pacote;

public class outraClasseMesmoPacote {

    public void testeDeAcesso(){

        Referencia r = new Referencia();

//      Dentro de outra classe, mas oriunda do mesmo pacote somente o modificador privado não dá acesso.
        r.modificadorDefault = 0;
        r.modificadorPublico = 0;
        r.modificadorProtegido = 0;
        //r.modificadorPrivado = 0;
    }
}
