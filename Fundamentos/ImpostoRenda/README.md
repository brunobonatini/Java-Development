# Programa:

## Objeto do programa é calcular o valor do imposto que o funcionário deve pagar de acordo com seu salário mensal.

import java.util.Locale;
import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double salario, valorImposto;
		
		System.out.print("Digite o valor do salário do funcionário: ");
		salario = input.nextDouble();
		
		if(salario >= 0 && salario <= 2000.00) {
			System.out.print("Isento de Imposto");
		}
		else if (salario > 2000.00 && salario <= 3000.00) {
			valorImposto = (salario - 2000.00) * 0.08;
			System.out.printf("Valor a pagar de Imposto: R$ %.2f", valorImposto);
		}
		else if (salario > 3000.00 && salario <= 4500.00) {
			valorImposto = ((salario - 3000.00) * 0.18) + (1000.00 * 0.08);
			System.out.printf("Valor a pagar de Imposto: R$ %.2f", valorImposto);
		}
		else {
			valorImposto = ((salario - 4500.00) * 0.28) + (1500.00 * 0.18) + (1000.00 * 0.08);
			System.out.printf("Valor a pagar de Imposto: R$ %.2f", valorImposto);
		}
		
		input.close();
	}

}
