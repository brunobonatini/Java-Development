# Programa:

## Objetivo do programa é calcular o valor do metro² de acordo com a área de um terreno.

import java.util.Locale;

import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = input.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = input.nextDouble();
		
		System.out.print("Digite o valor do m²: ");
		double metroQuadrado = input.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Preço: %.2f%n", preco);
		
		input.close();
		
	}
