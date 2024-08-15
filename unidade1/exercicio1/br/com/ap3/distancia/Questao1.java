/**
 * @codigo_secreto 115616925
 * 
 * Questão Distancia e amplitude
 * 
 * Este programa demonstra o cálculo da distância nas coordenadas (x e y) e o cálculo da amplitude dado 3 valores fornecidos pelo usuário
 * 
 * @author franciscoRosenilson
 * @version 1.0
 * @since 2024-08-14
 */

package br.com.ap3.distancia;

import java.util.Scanner;

public class Questao1 {
  
  public double getDistancia() {
  
  Scanner teclado = new Scanner(System.in);

  System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");

  double x1, y1, x2, y2, distancia = 1.0;

  x1 = teclado.nextDouble();
  y1 = teclado.nextDouble();
  x2 = teclado.nextDouble();
  y2 = teclado.nextDouble();
  
  teclado.close();

  distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

  System.out.println("A distância é: " + distancia );
  System.out.println();
    return distancia;
  }

  public double getAmplitude() {

    double val1 = 9.0;
    double val2 = 2.0;
    double val3 = -3.9;

    double amplitude = val1 - val2;
    System.out.println("A amplitude é: " + (amplitude - val3));
    return amplitude;
}

  public static void main(String[] args) {
    Questao1 questao1 = new Questao1();
    questao1.getDistancia();
    System.out.println();
    questao1.getAmplitude();
}

}