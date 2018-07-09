package pacote;

public class Referencia {

    int modificadorDefault;
    public int modificadorPublico;
    protected int modificadorProtegido;
    private int modificadorPrivado;

    public void testeDeAcesso(){

//        Dentro da propria classe referencia nos temos acesso a todas as variaveis.
        modificadorDefault = 0;
        modificadorPublico = 0;
        modificadorProtegido = 0;
        modificadorPrivado = 0;
    }
}
