/**
 * @codigo_Secreto 115616925
 * 
 * @Questão_2 Um menor inteiro positivo de uma lista ligada gerado aleatoriamente.
 * 
 * Este programa demonstra um metódo main utilizando uma lista ligada e o Random para gerar um inteiro positivo aleatório e exibindo para o usuário o resultado.
 * 
 * @author franciscoRosenilson
 * @version 1.0
 * @since 2024-08-15
 */

package questao2;
import java.util.LinkedList;
import java.util.Random;

public class InteiroRandom {
    public static void main(String[] args) {
        
        LinkedList<Integer> listaInteiros = new LinkedList<>();
       
        Random random = new Random();
        
        for (int i = 0; i < 9999; i++){
            listaInteiros.add(random.nextInt(Integer.MAX_VALUE));
        }
        
        int menorInteiro = Integer.MAX_VALUE;
        
        for (int numero : listaInteiros){
            if (numero < menorInteiro){
                menorInteiro = numero;
            }
        }     
        
        System.out.println("O menor inteiro positivo da lista é: " + menorInteiro);
    }
}
