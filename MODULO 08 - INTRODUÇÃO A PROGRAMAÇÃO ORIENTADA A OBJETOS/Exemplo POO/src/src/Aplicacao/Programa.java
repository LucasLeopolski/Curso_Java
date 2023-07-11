/*Fazer um programa para ler as medidas dos lados de dois triangulos X e y. Em seguida mostrar o valor das áreas dos triangulos e 
 * dizer qual dos dois possui a maior área. 
 * 
 * FORMULA DE HERON: area = rasizQ p(p-a)*(p-b)*(p-c)       onde p= (a+b+c)/2    p= perimetro 
 */

package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double areaX, areaY, p;
		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Infirme os lados e a base do triângulo X: ");
		x.ladoA = ler.nextDouble();
		x.ladoB = ler.nextDouble();
		x.base = ler.nextDouble();

		System.out.println("Infirme os lados e a base do triângulo Y: ");
		y.ladoA = ler.nextDouble();
		y.ladoB = ler.nextDouble();
		y.base = ler.nextDouble();

		areaX = x.area();

		areaY = y.area();

		System.out.printf("Área trinagulo X: %.4f%n", areaX);
		System.out.printf("Área trinagulo Y: %.4f%n", areaY);

		if (areaX > areaY) {

			System.out.println("MAIOR ÁREA: TRIÂNGULO X");
		} else {

			System.out.println("MAIOR ÁREA: TRIÂNGULO Y");
		}

		ler.close();

	}

}

// CÓDIGO SEM CLASSES ( SEM ORIENTAÇÃO A OBJETOS) 

/*
 * package Aplicacao;
 * 
 * import java.util.Locale; import java.util.Scanner;
 * 
 * public class Programa {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner ler = new Scanner(System.in); Locale.setDefault(Locale.US);
 * 
 * double xA, xB, xC, yA, yB, yC, p, areaX, areaY;
 * 
 * System.out.println("Infirme os lados e a base do triângulo X: "); xA =
 * ler.nextDouble(); xB = ler.nextDouble(); xC = ler.nextDouble();
 * 
 * System.out.println("Infirme os lados e a base do triângulo Y: "); yA =
 * ler.nextDouble(); yB = ler.nextDouble(); yC = ler.nextDouble();
 * 
 * p = (xA + xB + xC) / 2; areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p -
 * xC));
 * 
 * p = (yA + yB + yC) / 2; areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p -
 * yC));
 * 
 * System.out.printf("Área trinagulo X: %.4f%n", areaX);
 * System.out.printf("Área trinagulo Y: %.4f%n", areaY);
 * 
 * if (areaX > areaY) {
 * 
 * System.out.println("MAIOR ÁREA: TRIÂnGULO X"); } else {
 * 
 * System.out.println("MAIOR ÁREA: TRIÂNGULO Y"); }
 * 
 * ler.close();
 * 
 * }
 * 
 * }
 */
