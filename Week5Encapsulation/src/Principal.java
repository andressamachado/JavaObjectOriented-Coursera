public class Principal {

    public static void main(String[] args) {
        Pilha p  = new Pilha(10);

        p.empilhar("Eduardo");
        p.empilhar("Maria");
        p.empilhar("Mario");

        System.out.println(p.topo() + " está no topo");
        System.out.println("---------------------------");
        System.out.println("Tamanho da pilha é:  " + p.tamanho());

        //Desempilhando
        System.out.println("===========================");
        System.out.println(p.desempilhar() + " foi desempilhado");
        System.out.println(p.topo() + " está no topo");
        System.out.println("---------------------------");
        System.out.println("Tamanho da pilha é:  " + p.tamanho());
    }
}
