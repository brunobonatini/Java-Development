/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo. */ 

import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Posto de Combustível =====\n");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Sair\n");
		System.out.print("================================\n");
		
		int contAlc = 0;
		int contGas = 0;
		int contDie = 0;
		
		System.out.print("Escolha o seu combustível: ");
		int opcao = input.nextInt();
		
		while (opcao != 4) {
			
			if (opcao == 1) {
				contAlc += 1;
			}
			else if (opcao == 2) {
				contGas += 1;
			}
			else if (opcao == 3) {
				contDie += 1;
			}
			
			System.out.print("Escolha o seu combustível: ");
			opcao = input.nextInt();
			  
		}
		
		System.out.println("\n=== Muito Obrigado! ===\n");
		System.out.println("1 - Álcool: " + contAlc);
		System.out.println("2 - Gasolina: " + contGas);
		System.out.println("3 - Diesel: " + contDie);
		
		input.close();
		

	}

}
