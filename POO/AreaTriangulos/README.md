# Objetivo do programa:

<b>Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). 
Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.</b>

# Utilização da programação orientada a objetos

## Aplicação principal

package application;

import java.util.Scanner;

import entities.Triangulo;

public class AreaTriangulos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Importando a classe Triangulo e criando dois objetos X e Y
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite os valores do triângulo X: ");
		x.ladoA = input.nextDouble();
		x.ladoB = input.nextDouble();
		x.ladoC = input.nextDouble();
		
		System.out.println("Digite os valores do triângulo Y: ");
		y.ladoA = input.nextDouble();
		y.ladoB = input.nextDouble();
		y.ladoC = input.nextDouble();

		// Importando o método area criado na classe Triangulo e atribuindo na variável
		double areaX = x.area();	
		double areaY = y.area();
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
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

## Criação da classe e método

package entities;

// Criando a classe
public class Triangulo {

	public double ladoA;
	public double ladoB;
	public double ladoC;

 // Criando o método
	public double area() {
		double p = (ladoA + ladoB + ladoC) / 2.0;
		double result = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
		return result;		
	}

	}



















