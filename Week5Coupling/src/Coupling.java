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
//class CustomerRepository
//{
//    private readonly Database database;
//
//    public CustomerRepository(Database database)
//    {
//        this.database = database;
//    }
//
//    public void Add(string CustomerName)
//    {
//        database.AddRow("Customer", CustomerName);
//    }
//}
//
//class Database
//{
//    public void AddRow(string Table, string Value)
//    {
//    }
//}
//===============================================================
//Loose coupling concept:
//they are mostly independent
class Coupling {
    private readonly IDatabase
    database;

    public CustomerRepository(IDatabase database) {
        this.database = database;
    }

    public void Add(string CustomerName) {
        database.AddRow("Customer", CustomerName);
    }
}

interface IDatabase {
    void AddRow(string Table, string Value);
}

class Database :IDatabase{
public void AddRow(string Table,string Value){
        }
        }
