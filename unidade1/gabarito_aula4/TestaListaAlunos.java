package gabarito_aula4;

import java.util.LinkedList;

public class TestaListaAlunos {

    public static void main(String[] args) {
        LinkedList<Aluno> osAlunos = new LinkedList<Aluno>();

        for (int i = 0; i <= 89765; i++) {
            Aluno AlunoNumero = new Aluno();
            AlunoNumero.setNome("AlunoNumero " + i);
            osAlunos.add(AlunoNumero);
            System.out.println(AlunoNumero);
        }

        System.out.println("Imprimindo a lista de queridos");
        for (Aluno aluno : osAlunos) {
            System.out.println(aluno);
        }
    }
}
