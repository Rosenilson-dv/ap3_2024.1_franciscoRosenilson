

public class TestaAluno {
    public static void main(String[] args) {
        
        Aluno rosenilson = new Aluno();
        rosenilson.setNome("Francisco Rosenilson");
        rosenilson.setNota1(10);
        rosenilson.setNota2(2);
        rosenilson.setNota3(6);
        System.out.println();
        System.out.println(rosenilson);

        if (rosenilson.aprovadoMedia())
            System.out.println("Passou por media");
        else
            System.out.println("Se fudeu, tirou " + rosenilson.getMedia());    
    }
}
