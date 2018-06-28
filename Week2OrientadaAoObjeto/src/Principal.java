public class Principal {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.bimestre1 = 70;
        aluno1.bimestre2 = 40;
        aluno1.bimestre3 = 80;
        aluno1.bimestre4 = 60;

        System.out.println(aluno1.media());
        System.out.println(aluno1.passouDeAno());
    }
}

