package entidades;

public class Triangulo {

public double ladoA, ladoB, base;
	
	
	public double area() {
		
		double p = (ladoA + ladoB + base) / 2;
		return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - base));
	}

}

