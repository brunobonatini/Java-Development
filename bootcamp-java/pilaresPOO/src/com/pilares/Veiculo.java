package com.pilares;

public abstract class Veiculo {
	
	private String chassi;
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	// abstração
	public abstract void ligar();

}
