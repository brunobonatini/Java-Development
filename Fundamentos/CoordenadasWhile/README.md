<h1>Programa:</h1>

<b>Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
Para cada ponto escrever o quadrante a que ele pertence.
O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Código:</b>

import java.util.Scanner;

public class CoordenadasWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = input.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		int y = input.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
				
				System.out.print("Digite o valor de X: ");
				x = input.nextInt();
				
				System.out.print("Digite o valor de Y: ");
				y = input.nextInt();
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");
				
				System.out.print("Digite o valor de X: ");
				x = input.nextInt();
				
				System.out.print("Digite o valor de Y: ");
				y = input.nextInt();
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
				
				System.out.print("Digite o valor de X: ");
				x = input.nextInt();
				
				System.out.print("Digite o valor de Y: ");
				y = input.nextInt();
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
				
				System.out.print("Digite o valor de X: ");
				x = input.nextInt();
				
				System.out.print("Digite o valor de Y: ");
				y = input.nextInt();
			}
		}
		
		input.close();
	}

}
