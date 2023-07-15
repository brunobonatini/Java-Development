<h1>Programa:</h1>

<b>Escreva um programa que repita a leitura de uma senha até que ela seja válida.</b>

Código:
import java.util.Scanner;

public class AutenticadorSenha {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Digite a senha correta: ");
		int senha = input.nextInt();
		
		int senhaCorreta = 2002;
		
		while (senha != 2002) {
			System.out.println("Senha incorreta!");
			System.out.print("Digite a senha correta: ");
			senha = input.nextInt();
		}
		
		System.out.print("Acesso permitido!");
		
		input.close();

	}

}
