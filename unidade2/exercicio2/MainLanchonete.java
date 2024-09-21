package unidade2.exercicio2;

import unidade2.exercicio2.lanchonete_polimorfismo.Bebida;
import unidade2.exercicio2.lanchonete_polimorfismo.DoceDeFruta;
import unidade2.exercicio2.lanchonete_polimorfismo.Salgado;

public class MainLanchonete {

    public static void main(String[] args) {
           
        Bebida refrigerante = new Bebida("Coca Cola", 2.5 , 100);
        Salgado coxinha = new Salgado("Pastel de Forno" , 4.0 , "Cinco");
        DoceDeFruta sobremesa = new DoceDeFruta("Doce" , 7.0 , "Maracujá");

        refrigerante.consumir();

        System.out.println(refrigerante);
        
        coxinha.consumir();
        
        System.out.println(coxinha);
        
        sobremesa.consumir();

        System.out.println(sobremesa);
    }
}
