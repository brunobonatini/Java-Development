package util;

public class CurrencyConverter {
	
	// Método estático
	public static double IOF = 0.06;
	
	public static double realConverter(double dollarValue, double dollarBy) {
		return dollarValue * dollarBy * (1.0 + IOF);

	}

}
