# Programa:

## Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, qtdPeca1, qtdPeca2;
		double valorPeca1, valorPeca2, valorTotal;
		
		System.out.print("Código Peça1: ");
		peca1 = sc.nextInt();
		
		System.out.print("Quantidade Peça1: ");
		qtdPeca1 = sc.nextInt();
		
		System.out.print("Valor Peça1: ");
		valorPeca1 = sc.nextDouble();
		
		System.out.print("Código Peça2: ");
		peca2 = sc.nextInt();
		
		System.out.print("Quantidade Peça2: ");
		qtdPeca2 = sc.nextInt();
		
		System.out.print("Valor Peça2: ");
		valorPeca2 = sc.nextDouble();
		
		valorTotal = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
		
		System.out.printf("Valor total a pagar: R$ %.2f", valorTotal);
		
		sc.close();

	}

}
