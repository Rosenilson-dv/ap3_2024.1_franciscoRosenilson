package gabarito_aula5;

import gabarito_aula4.Aluno;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestaAlunoScanner {

    public static void main(String[] args) {
        
        Aluno umAluno = new Aluno();
        Scanner teclado = new Scanner(System.in);
        System.out.println();

        System.out.println("Digite o nome do aluno: ");
        String nomeDoAluno = teclado.nextLine();

        System.out.println("Digite a nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = teclado.nextDouble();

        System.out.println("Digite o nome da Maezinha:");
        String nomeDaMae = teclado.next();

        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite a data de nascimento (formato dd/MM/yyyy): ");
        String dataNascimentotoString = teclado.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentotoString, padrao);

        umAluno.setNome(nomeDoAluno);
        umAluno.setNota1(nota1);
        umAluno.setNota2(nota2);
        umAluno.setNota3(nota3);
        umAluno.setNomeDaMae(nomeDaMae);
        umAluno.setDataNascimento(dataNascimento);
        System.out.println(umAluno);
        teclado.close();
    }
}
