/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
situação. */

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float x, y;
		
		System.out.print("Digite o valor de X: ");
		x = input.nextFloat();
		
		System.out.print("Digite o valor de Y: ");
		y = input.nextFloat();
		
		if (x == 0 && y == 0) {
			System.out.print("O ponto está na Origem");
		}
		else if (x != 0 && y == 0) {
			System.out.print("O ponto está no eixo X");
		}
		else if (x == 0 && y != 0) {
			System.out.print("O ponto está no eixo Y");
		}
		else if (x > 0 && y > 0) {
			System.out.print("O ponto está no Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.print("O ponto está no Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.print("O ponto está no Q3");
		}
		else {
			System.out.print("O ponto está no Q4");
		}
		
		input.close();

	}

}
