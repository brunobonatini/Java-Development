package com.pilares;

// herança da classe Veiculo
public class Carro extends Veiculo {
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro Ligado");
	}
	// encapsulamento
	private void confereCambio() {
		System.out.println("Confere Cambio em P");
	}
	private void confereCombustivel() {
		System.out.println("Confere Combustivel");
	}

}
