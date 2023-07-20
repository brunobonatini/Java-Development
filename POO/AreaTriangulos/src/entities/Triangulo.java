package entities;

public class Triangulo {

	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double area() {
		double p = (ladoA + ladoB + ladoC) / 2.0;
		double result = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
		return result;		
	}

	}
