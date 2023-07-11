package Programa;

public class ConverterMoeda {
	
	public static  double IOF = 0.06; 
	
	public static double conversao( double quantidadeDolar, double precoDolar) {
		
		return quantidadeDolar * precoDolar * (1.0 + IOF);
		
	}

}
