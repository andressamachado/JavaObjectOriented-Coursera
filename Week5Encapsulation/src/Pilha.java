public class Pilha {

    private Object[] elementos;
    private int topo = 0;

    public Pilha(int maximo) {
        elementos = new Object[maximo];
    }

    public void empilhar(Object elemento) {
        elementos[topo] = elemento;
        topo++;
    }

    public Object desempilhar() {
        topo--;
        return elementos[topo];
    }

    public Object topo() {
        return elementos[topo - 1];
    }

    public int tamanho() {
        return topo;
    }

    public Object[] getElementos() {
        return elementos;
    }

    public void setElementos(Object[] elementos) {
        this.elementos = elementos;
    }

//    o metodo setTopo mudaria a estrutura interna da pilha, o que não é desejado. (Erro)
//    public void setTopo(int topo) {
//        this.topo = topo;
//    }
}

//=========================================================================================
//Quando se trata de encapsulamento, existe o problema de se alterar o que esta dentro do objeto e que nao deveria  ser alterado.
//Solução: Copia o objeto que esta dentro da classe e retorna. Dessa forma, o que for alterado nao é o que esta dentro do objeto.
//
//  public class Atriz{
//      private Ator amante;
//
//      public Ator getAmante(){
//          // copia  informações amante.
//           Ator at = new Ator();
//           return at;
//       }
//}
//
////Dessa forma, o  objeto  que compoe a classe atriz nao sera modificado!
//
//          Ator a = atriz.getAmante();
//          a.setName("Fulano");

//======================================================
//Mesma coisa para arrays:
//
//  public class Atriz{
//      private String[] premios;
//      public String[] getPremios(){
//          String[] copia = Arrays.copyOf(premios, premios.length);
//          return copia;
//       }
//  }
//      String[] p = atriz.getPremios();
//      p[0] =  "Framboesa de ouro";

//// ==================================================================================

//Solução #2: Esconder o objeto. Não retornar o objeto de forma alguma.Criasse metodos que controlam oacesso sem retornar  o
//objeto diretamente.
//não retornando o objeto inteiro.
//
//  public class Atriz{
//      private Ator amante;
//      public String getNomeAmante(){
//          return amante.getNome();
//      }
//      public int getIdadeAmante(){
//          return amante.getIdade();
//       }
//  }


//======================================================
//Em Arrays: no case de arrays, podem ser utilizados métodos que recebem o indice a ser retornado.
//
//  public  class Atriz{
//      private  String[] premios;
//      public String getPremio(int i) {
//          return premios[i];
//        }
//  }


