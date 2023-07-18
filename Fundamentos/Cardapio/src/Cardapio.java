/* Escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar. */

import java.util.Scanner;

public class Cardapio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int codProduto, qtdProduto;
		double valorTotal;
		String descProduto;
		
		// descrevendo o cardápio
		System.out.println("===========Cardapio============\n");
		System.out.println("1 - Cachorro Quente - R$ 4.00");
		System.out.println("2 - X-Salada -------- R$ 4.50");
		System.out.println("3 - X-Bacon --------- R$ 5.00");
		System.out.println("4 - Torrada Simples - R$ 2.00");
		System.out.println("5 - Refrigerante ---- R$ 1.50\n");
		System.out.println("===============================");
		
		// solicitando uma opção ao usuário
		System.out.println("Escolha a sua opção: ");
		codProduto = input.nextInt();
		
		// estrutura condicional para as opções
		if (codProduto == 1) {
			descProduto = "Cachorro Quente";
			System.out.println(descProduto);
		}
		else if (codProduto == 2) {
			descProduto = "X-Salada";
			System.out.println(descProduto);
		}
		else if (codProduto == 3) {
			descProduto = "X-Bacon";
			System.out.println(descProduto);
		}
		else if (codProduto == 4) {
			descProduto = "Torrada Simples";
			System.out.println(descProduto);
		}
		else if (codProduto == 5) {
			descProduto = "Refrigerante";
			System.out.println(descProduto);
		}
		else {
			System.out.print("Opção Inválida\n");
		}
		
		// escolhendo a quantidade do produto
		System.out.println("Escolha a quantidade do produto: ");
		qtdProduto = input.nextInt();
		
		// calculando o valor total a pagar
		if (codProduto == 1) {
			valorTotal = qtdProduto * 4.00;
			System.out.printf("Total a pagar: R$ %.2f", valorTotal);
		}
		else if (codProduto == 2) {
			valorTotal = qtdProduto * 4.50;
			System.out.printf("Total a pagar: R$ %.2f", valorTotal);
		}
		else if (codProduto == 3) {
			valorTotal = qtdProduto * 5.00;
			System.out.printf("Total a pagar: R$ %.2f", valorTotal);
		}
		else if (codProduto == 4) {
			valorTotal = qtdProduto * 2.00;
			System.out.printf("Total a pagar: %.2f", valorTotal);
		}
		else if (codProduto == 5) {
			valorTotal = qtdProduto * 1.50;
			System.out.printf("Valor a pagar: %.2f", valorTotal);
		}
		
		
		input.close();

	}

}
