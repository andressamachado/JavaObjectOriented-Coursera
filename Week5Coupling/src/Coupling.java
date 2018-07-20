// refers to the degree of direct knowledge that one element has of another.
// In other words, how often do changes in class A force related changes in class B.
//Relacionamento e dependencia.
//Quanto menos acoplamento, menos problemas pro sistema.

//Pior tipo: Internal Data Coupling(com Dados Internos):
//Dados internos publicos. Acesso a uma variavel que nao deveria. -Quebra o principio de encapsulamento
//(acesso atraves de metodos apenas.)
//Dados expostos por getters and setters é tambem considerado uma má conduta em coupling.
// (equivalente a ser publico)

//===============================================================
// tight coupling concept
//any change in the Topic class requires Coupling class to change.
    public class Coupling {

        Topic t = new Topic();
        public void startReading()
        {
            t.understand();
        }
    }
    class Topic {
        public void understand()
        {
            System.out.println("Tight coupling concept");
        }
    }

//===============================================================
//Loose coupling concept:
//they are mostly independent