package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Medidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		//Importando a Classe Rectangle e instanciando o objeto retangulo
		Rectangle retangulo = new Rectangle();
		
		//Entrando com os valores do retangulo
		System.out.print("Digite o valor da largura do retângulo: ");
		retangulo.width = input.nextDouble();
		
		System.out.print("Digite o valor da altura do retângulo: ");
		retangulo.height = input.nextDouble();
		
		//Importando os métodos da Classe Rectangle
		double area = retangulo.area();
		double perimeter = retangulo.perimeter();
		double diagonal = retangulo.diagonal();
		
		//Mostrando as medidas do retangulo
		System.out.println("Área: " + area);
		System.out.println("Perímetro: " + perimeter);
		System.out.println("Diagonal: " + diagonal);
		
		input.close();
		
	}

}
