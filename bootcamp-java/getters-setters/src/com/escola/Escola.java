package com.escola;

public class Escola {
	
	public static void main(String[] args) {
		
		Aluno bruno = new Aluno();
		bruno.setNome("Bruno");
		bruno.setSexo("M");
		bruno.setIdade(36);
		
		System.out.println("O aluno " + bruno.getNome() +  " tem " + bruno.getIdade() + " anos.");
	}

}
