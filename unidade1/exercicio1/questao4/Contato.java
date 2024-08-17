/**
 * @codigo_Secreto 115616925
 * 
 * @Questão_4 Construa e teste com 3 instâncias diferentes a classe a seguir. No toString() exiba todos os valores dos atributos, sendo que o nome deve ser exibido sempre em letra MAIÚSCULA. As 3 instâncias devem ser criadas no método main. O construtor é feito com 2 parâmetros. Os nomes nas instâncias devem ser de pintores renascentistas.
 * 
 * Este programa demonstra o nome de 3 pintores renascentistas e seus respectivos números de telefone, onde os nomes também serão impressos em maisculo. 
 * 
 * @author franciscoRosenilson
 * @version 1.0
 * @since 2024-08-17
 **/

package questao4;

public class Contato {

    String nome1 = "Leonardo da Vinci";
    String telefone1 = " (84) 99482-1563";
    String nome2 = " Michelangelo Buonarroti";
    String telefone2 = " (84) 99836-7429";
    String nome3 = " Sandro Botticelli";
    String telefone3 = " (84) 99654-2081";

    public Contato(String nome1,String nome2,String nome3, String telefone1,String telefone2,String telefone3){
        this.nome1 = nome1;
        this.telefone1 = telefone1;
        this.nome2 = nome2;
        this.telefone2 = telefone2;
        this.nome2 = nome2;
        this.telefone2 = telefone2;
    }

    public String getNome1() {
        return nome1;
    }
    
    public String getNomeMaisculo() {
        return nome1.toUpperCase();
    }
    
    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }
    
    public String getTelefone1() {
        return telefone1;
    }
    
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }
    
    public String getNome2() {
        return nome2;
    }
    
    public String getNomeMaisculo2() {
        return nome2.toUpperCase();
    }
    
    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }
    
    public String getTelefone2() {
        return telefone2;
    }
    
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    
    public String getNome3() {
        return nome3;
    }
    
    public String getNomeMaisculo3() {
        return nome3.toUpperCase();
    }
    
    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public String getTelefone3() {
        return telefone3;
    }
    
    public void setTelefone3(String telefone3) {
        this.telefone3 = telefone3;
    }

    @Override
    public String toString() {
        return "Contato [nome1=" + nome1 + ", telefone1=" + telefone1 + ", nome2=" + nome2 + ", telefone2=" + telefone2
                + ", nome3=" + nome3 + ", telefone3=" + telefone3 + ", getNome1()=" + getNome1()
                + ", getNomeMaisculo()=" + getNomeMaisculo() + ", getTelefone1()=" + getTelefone1() + ", getNome2()="
                + getNome2() + ", getNomeMaisculo2()=" + getNomeMaisculo2() + ", getTelefone2()=" + getTelefone2()
                + ", getNome3()=" + getNome3() + ", getNomeMaisculo3()=" + getNomeMaisculo3() + ", getTelefone3()="
                + getTelefone3() + "]";
    }
    public static void main(String[] args) {
        Contato contato = new Contato(" Leonardo da Vinci", " Michelangelo Buonarroti", " Sandro Botticelli", 
        " (84) 99482-1563", " (84) 99836-7429", " (84) 99654-2081");

        System.out.println(contato);
    }
}