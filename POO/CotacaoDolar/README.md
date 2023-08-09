# Programa:

Faça um programa para ler a cotação do dólar e depois o valor em dólares a ser comprado por uma pessoa em reais,
considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
Criar uma classe CurrencyConvert para ser responsável pelos cálculos.

Utilizar método estático.

## Código:

package application;

import java.util.Locale;

import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarValue = input.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarBy = input.nextDouble();
		
		double totalPaid = CurrencyConverter.realConverter(dollarValue, dollarBy);
		
		System.out.printf("Total Paid with IOF: %.2f", totalPaid);
		
		input.close();
		

	}

}

package util;

public class CurrencyConverter {
	
	// Método estático
	public static double IOF = 0.06;
	
	public static double realConverter(double dollarValue, double dollarBy) {
		return dollarValue * dollarBy * (1.0 + IOF);

	}

}
