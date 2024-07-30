/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
 *Em seguida, calcule e mostre:  
 *a) a área do triângulo retângulo que tem A por base e C por altura.  
 *b) a área do círculo de raio C. (pi = 3.14159)  
 *c) a área do trapézio que tem A e B por bases e C por altura.  
 *d) a área do quadrado que tem lado B.  
 *e) a área do retângulo que tem lados A e B. 
 * */

package area;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, pi = 3.14159;
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Informe três valores: ");
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		areaTriangulo = a*c / 2.0;
		
		areaCirculo = pi *  Math.pow(c,2);
		
		areaTrapezio = (a+b)*c /2.0;
		
		areaQuadrado = b*b;  
		
		areaRetangulo =  a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
				
				
		ler.close();;

	}

}
