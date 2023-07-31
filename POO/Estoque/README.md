# Programa

Objetivo do programa é solicitar ao usuário que entre com um produto, seu valor e sua quantidade em estoque.

O programa irá solicitar que o usuário entre com as quantidades a serem adicionadas e também removidas do estoque.

O programa deve mostrar o Nome do produto, sua quantidade e o valor total dos itens em estoque atualizados.

Criar uma classe Produto com as ações de adicionar e remover as quantidades conforme a solicitação do usuário.

## Código

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

## Classe

package entities;

public class Product { // Criando a classe
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() { // Criando os métodos
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; // a palavra this referencia o atributo
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity 
				+ " unidades, Total: $ " + String.format("%.2f", totalValueInStock());
			
	}
}

<img src = "https://github.com/brunobonatini/Java-Development/blob/main/POO/Estoque/estoque.png">
