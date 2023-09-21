
public enum EstadoBrasileiro {
	
	SAO_PAULO ("SP", "São Paulo", 10),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 11),
	PIAUI ("PI", "Piauí", 12),
	MARANHAO ("MA", "Maranhão", 13),
	MINAS ("MG", "Minas Gerais", 14);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	// criando um construtor
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	
	// getters and setters
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getIbge() {
		return ibge;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	

}
