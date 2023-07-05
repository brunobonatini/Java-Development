import java.util.Scanner;

public class DiaSemanaSc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		String dia;
		
		System.out.print("Escolha um dia da semana: ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Dia inválido";
			break;
		}
		
		System.out.print("Dia da semana: " + dia);
		
		input.close();
	}

}
