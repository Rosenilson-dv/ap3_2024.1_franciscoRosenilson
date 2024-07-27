package ap3_franciscoRosenilson.unidade1.gabarito_aula3;

public class TestaAluno {

    public static void main(String[] args) {
        
        Aluno rosenilson = new Aluno();
        rosenilson.setNomeDoAluno("Francisco Rosenilson");
        rosenilson.setNota1(10);
        rosenilson.setNota2(7);
        rosenilson.setNota3(6);
        System.out.println();
        System.out.println(rosenilson);

        if (rosenilson.aprovadoMedia())
            System.out.println("Passou por media");
        else
            System.out.println("Se fudeu, tirou " + rosenilson.getMedia);    
    }
}
