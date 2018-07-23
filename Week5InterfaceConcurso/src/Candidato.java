//Define os metodos de uma classe que a implementa precisa ter.
//
//public Candidato Movel{
//
//    public void mover();
//    public void parar();
//    public void getVelocidade();
//}
//
//Todo metodo de interface é abstrato. Por esse motivo o uso da palavra "abstract" é opcional."
//é obrigatorio a implementacao na classe que sera regida pela interface.
//Pode ser utilizado métidos abstratos e atributos finais e estaticos.
//
//public class Cavalo implements Movel {
//precisa implementar todos os metodos da interface.
//}
// ===================================================================
//Uma interface pode estender uma ou mais interfaces.
//
//public interface Televisor extends Ligavel, ComCanais{
//pode definir mais metodos.
//}
// ===================================================================
//Uma classe pode implementar uma ou mais interfaces:
//
//public class SmartTV implements Televisor, PlayerVideo{
//deve implementar o contrato de todas as suas interfaces.
//}
// ===================================================================
//Collections.sort(list);
// metado sort()! depende da interface e nao da classe.
//só sao passadas e reconhecidas classes que tem o contrato(interface)

public class Candidato implements Comparable<Candidato> {

    private int nota;
    private boolean deficiente;
    private int idade;

    public Candidato(int nota, boolean deficiente, int idade) {
        this.nota = nota;
        this.deficiente = deficiente;
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public boolean isDeficiente() {
        return deficiente;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Candidato outro) {

        if (nota == outro.getNota()) {
            if (deficiente == outro.isDeficiente()) {
                return idade - outro.getIdade();
            } else if (deficiente) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return nota - outro.getNota();
        }
    }

    @Override
    public String toString() {
        return nota + ";" + deficiente + ";" + idade;
    }
}