# Programa:

## Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
## começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Digite a hora inicial do Jogo: ");
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final do Jogo: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial >= 0 && horaInicial <=24 && horaFinal >=0 && horaFinal <=24) {
			if (horaInicial == horaFinal) {
				duracao = 24;
				System.out.printf("O Jogo durou %d hora(s)", duracao);
			}
			else if (horaInicial > horaFinal) {
				duracao = 24 - (horaInicial - horaFinal);
				System.out.printf("O Jogo durou %d hora(s)", duracao);
			}
			else if (horaInicial < horaFinal) {
				duracao = (horaFinal - horaInicial);
				System.out.printf("O Jogo durou %d hora(s)", duracao);
			}
		}
		else {
			System.out.print("Hora inválida!");
		}

		sc.close();

	}

}
