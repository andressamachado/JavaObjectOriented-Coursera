package outro;

import pacote.Referencia;

public class subClasse extends Referencia {

    public void testeDeAcesso(){

//        dois pacotes diferentes, tendo herança entre duas classes, comente o publico e o protegido dão acesso.
        //modificadorDefault = 0;
        modificadorPublico = 0;
        modificadorProtegido = 0;
        //modificadorPrivado = 0;
    }

}
