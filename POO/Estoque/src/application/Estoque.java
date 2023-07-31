package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Product produto = new Product();
		
		System.out.print("Nome do produto: ");
		produto.name = input.nextLine();
		
		System.out.print("Preço do produto: ");
		produto.price = input.nextDouble();
		
		System.out.print("Quantidade do produto: ");
		produto.quantity = input.nextInt();
		
		System.out.println("Dados do produto: " + produto);
		
		System.out.print("Entre com a quantidade a ser adicionada no estoque: ");
		int quantity = input.nextInt();
		produto.addProducts(quantity);
		
		System.out.println("Estoque atualizado: " + produto);
		
		System.out.print("Entre com a quantidade a ser removida do estoque: ");
		quantity = input.nextInt();
		produto.removeProducts(quantity);
		
		System.out.println();
		System.out.print("Estoque atualizado: " + produto);
		
		
		input.close();

	}

}
