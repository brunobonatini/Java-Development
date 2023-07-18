import java.util.Locale;
import java.util.Scanner;

public class DescontoTernaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o preço: ");
		double preco = input.nextDouble();
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		// Valor calculado: se preço menor que 20, preco * 0.10, senão preco * 0.05
		
		System.out.printf("Valor do desconto: %.2f", desconto); 
		
		input.close();
	}

}

/* if(preco < 20.0){
 *	  desconto = preco * 0.1;
 *}
 *else{
 *	  desconto = preco * 0.05;
 *}
 */