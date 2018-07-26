public class Principal {

    public static void main(String[] args) {
        a(-100);

        System.out.println("Terminando a  execução de  main()");
    }

    public static void a(int i) {
        System.out.println("executando a() com " + i);

//a execução vai entrar no try e no momento que acontecer o erro, a execução vai pular para o catch.
//ou seja, o código que vem após o erro  dentro do try não será executado.
//pode haver um metodo em que mais de um tipo de erro pode acontecer. É possivel haver varios blocos de catch.
//Porem so um catch sera executado e  sairá do bloco.]
// subclasses antes da super classe.
        try {
            b(i);
        } catch (Exception e) {
            System.out.println("Tratando a exceção: " + e.getMessage());
        }
        // é possivel declarar um mesmo tratamento  de erro para mais de um tipo de  exceção:
        //try {
        //acessa o banco
        // escreve arquivo
        //} catch(IOException|SQLExeption e){
        //tratarErro(e);
        //}
//======================================================
//        finally é uma outra parte do try/catch que executa independentemente de acontecer uma  exceção ou não.
//                Não acontecendo, a execução pula direto para o finally. Acontecendo, o  bloco do catch será executado e logo em seguida o finally.
        System.out.println("Terminando a  execução de a()");
    }

    public static void b(int i) throws Exception {
        System.out.println("executando b() com " + i);
        if (i > 0)
            throw new Exception("mensagem");
        System.out.println("Terminando a  execução de b()");
    }
}
