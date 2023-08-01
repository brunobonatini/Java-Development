package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		//Instanciando o objeto aluno da Classe Student
		Student aluno = new Student();
		
		System.out.print("Digite a média do primeiro trimestre (0 a 30): ");
		aluno.media1 = input.nextDouble();
		
		System.out.print("Digite a média do segundo trimestre (0 a 35): ");
		aluno.media2 = input.nextDouble();
		
		System.out.print("Digite a média do terceiro trimestre (0 a 35): ");
		aluno.media3 = input.nextDouble();
		
		System.out.println("Média Final: " + aluno.mediaFinal());
		
		if (aluno.mediaFinal() < 60.0) {
			System.out.println("Você reprovou.");
			System.out.printf("Faltaram %.2f pontos.%n", aluno.pontosFaltantes());
		}
		else {
			System.out.println("Você passou!");
		}
		
		input.close();
	}

}
