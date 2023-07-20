# Programa

## Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qtdHoras;
		double valorHora, salario;
		
		System.out.println("Código do funcionário:");
		cod = sc.nextInt();
		
		System.out.println("Horas trabalhadas:");
		qtdHoras = sc.nextInt();
		
		System.out.println("Valor ganho por hora:");
		valorHora = sc.nextDouble();
		
		salario = (double) qtdHoras * valorHora;
		
		System.out.printf("O salário mensal do funcionário %d é de $ %.2f", cod, salario);
		
		
		sc.close();

	}

}
