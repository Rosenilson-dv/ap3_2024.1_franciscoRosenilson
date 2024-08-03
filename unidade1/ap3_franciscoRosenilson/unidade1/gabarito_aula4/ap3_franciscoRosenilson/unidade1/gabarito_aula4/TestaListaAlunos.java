package ap3_franciscoRosenilson.unidade1.gabarito_aula4;

import java.util.LinkedList;

public class TestaListaAlunos {

    public static void main(String[] args) {
        LinkedList<Aluno> osalunos = new LinkedList<Aluno>();

        for (int i = 0; i <= 89765; i++) {
            Aluno rosenilsonAluno = new Aluno();
            rosenilsonAluno.setNome("rosenilsonAluno " + i);
            osalunos.add(rosenilsonAluno);
            System.out.println(rosenilsonAluno);
        }
        
    }
}
