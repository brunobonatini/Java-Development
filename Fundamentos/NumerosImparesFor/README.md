# Programa:

## Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
## X, se for o caso.

import java.util.Scanner;

public class NumerosImparesFor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro de 1 até 1000: ");
		int numero = input.nextInt();
		
		System.out.printf("Os números ímpares até %d são: %n", numero);
		for (int i = 1; i <= numero; i += 2) {
			
			System.out.println(i);
		}

		input.close();
	}

}
