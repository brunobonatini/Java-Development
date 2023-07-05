/* Faça um programa que calcule o valor total a ser pago por sua conta de telefonia mensal.
 * O valor base de sua conta é 50.00 por 100 minutos. Para cada minuto ultrapassado é cobrado R$ 2.00 a mais na conta. 
 */

import java.util.Locale;
import java.util.Scanner;

public class ConsumoTelefone {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int qtdMinuto;
		double conta = 50.00;
		
		System.out.print("Digite a quantidade de minutos consumidos: ");
		qtdMinuto = input.nextInt();
		
		// UTILIZANDO OPERADOR DE ATRIBUIÇÃO CUMULATIVA
		if (qtdMinuto > 100) {
			conta += ((qtdMinuto - 100) * 2.00);
		}
		
		System.out.printf("Total a pagar: R$ %.2f%n", conta);
		
		input.close();

	}

}
