/**
 * @codigo_Secreto 115616925
 * 
 * @Questão_3 Sabendo que latão é 70% de cobre e 30% de zinco, indique a quantidade de cada um desses componentes para se obter uma certa quantidade de quilos de latão que foi requerida pelo usuário.
 * 
 * Este programa demonstra a quantidade de latão informada pelo cliente e suas respectivas quantidades de cobre e zinco percentuais dentro do parâmetro inicialmente informado pelo usuário.
 * 
 * @author franciscoRosenilson
 * @version 1.0
 * @since 2024-08-15
 **/
package questao3;
import java.util.Scanner;

public class Componentes {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de latão (em kg) desejada: ");
        
        double quantLatao = teclado.nextDouble();
        double quantCobre = quantLatao * 0.7;
        double quantZinco = quantLatao * 0.3;

        System.out.println();
        System.out.println("Em: " + quantLatao + " quilos de latão");
        System.out.println();   
        System.out.println("Você irá ter: " + quantCobre + "% quilos de cobre");
        System.out.println();
        System.out.println("Você irá ter: " + quantZinco + "% quilos de zinco");
        
        teclado.close();
    }
}
