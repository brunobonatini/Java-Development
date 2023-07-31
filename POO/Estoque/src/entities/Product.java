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
