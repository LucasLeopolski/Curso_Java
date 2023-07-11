package entidades;

public class Retangulo {

	public double base, altura;

	public double area() {

		return base * altura;
	}

	public double perimetro() {

		return 2 * (base + altura);
	}

	public double diagonal() {

		return Math.sqrt(base * base + altura * altura);
	}

	public String toString() {

		return "AREA DO RETANGULO: " + String.format("%.2f", area()) + "\nPERIMETRO DO RETANGULO: "
				+ String.format("%.2f", perimetro()) + "\nDIAGONAL DO RETANGULO: " + String.format("%.2f", diagonal());
	}

}
