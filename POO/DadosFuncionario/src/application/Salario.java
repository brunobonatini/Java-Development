package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.print("Digite o nome do funcionário: ");
		funcionario.name = input.nextLine();
		
		System.out.print("Digite o salário bruto do funcionário: ");
		funcionario.grossSalary = input.nextDouble();
		
		System.out.print("Digite o valor do imposto: ");
		funcionario.tax = input.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.println();
		System.out.print("Qual o percentual deve ser adicionado no salário: ");
		double percentage = input.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println("Dados Atualizados:");
		System.out.println(funcionario);
		
		
		input.close();

	}

}
