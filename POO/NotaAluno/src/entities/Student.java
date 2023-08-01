package entities;

public class Student {
	
	public String name;
	public double media1;
	public double media2;
	public double media3;
	
	public double mediaFinal() {
		return media1 + media2 + media3;
	}
	
	public double pontosFaltantes() {
		if (mediaFinal() < 60.0) {
			return 60.0 - mediaFinal();
		}
		else {
			return 0.0;
		}
	}

}
