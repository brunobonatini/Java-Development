package construtores;

public class SistemaCadastro {
	
	public static void main(String[] args) {
		
		//criar uma pessoa no sistema
		Pessoa pessoa = new Pessoa("Bruno", "123");
		
		//definir o endereço de bruno
		pessoa.setEndereco("Rua das Primulas");
		
		System.out.println(pessoa.getNome() + " " + pessoa.getCpf());
		
	}
	
}
