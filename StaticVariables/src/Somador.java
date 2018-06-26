//A static variable is common to all the instances (or objects) of the class because it is a class level variable.
//Only a single copy of static variable is created and shared among all the instances of the class.
//Memory allocation for such variables only happens once when the class is loaded in the memory.
//Like variables we can have static block, static method and static class.

public class Somador {

    String nome;
    int valorInstancia = 0;
    static int valorEstatica = 0;

    void somar(){
        valorInstancia++;
        valorEstatica++;
    }

    void imprimir(){
        System.out.println("O somador " + nome + ": instancia=" + valorInstancia+ " e estatica=" + valorEstatica);
    }
}
