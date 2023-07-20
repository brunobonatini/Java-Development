/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.*/

package application;

import java.util.Scanner;

public class AreaTriangulos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double xLadoA, xLadoB, xLadoC, yLadoA, yLadoB, yLadoC;
		
		System.out.println("Digite os valores do triângulo X: ");
		xLadoA = input.nextDouble();
		xLadoB = input.nextDouble();
		xLadoC = input.nextDouble();
		
		System.out.println("Digite os valores do triângulo Y: ");
		yLadoA = input.nextDouble();
		yLadoB = input.nextDouble();
		yLadoC = input.nextDouble();

		/* A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
		seguinte (fórmula de Heron):*/
		double pX = (xLadoA + xLadoB + xLadoC) / 2;
		double areaX = Math.sqrt(pX * (pX - xLadoA) * (pX - xLadoB) * (pX - xLadoC));
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		
		double pY = (yLadoA + yLadoB + yLadoC) / 2;
		double areaY = Math.sqrt(pY * (pY - yLadoA) * (pY - yLadoB) * (pY - yLadoC));
		
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		
		/* Condicional para a maior área */
		if (areaX > areaY) {
			System.out.println("Maior área: triângulo X");
		}
		else {
			System.out.println("Maior área: triângulo Y");
		}
		
		
		input.close();

	}

}
