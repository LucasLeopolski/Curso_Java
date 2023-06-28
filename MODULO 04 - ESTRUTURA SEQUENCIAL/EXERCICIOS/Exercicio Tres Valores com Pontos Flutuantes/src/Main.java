/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B*/

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double a, b, c, areaTriangulo, areaCirculo, areaQuadrado, areaRetangulo, areaTrapezio,
		pi = 3.14159; 
		
		System.out.println("Informe os valores de A, B, C:   ");
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		
		areaTriangulo = (a * c) /2 ;
		areaCirculo = pi * c * c; 
		areaTrapezio = (a+b)*c/2;
		areaQuadrado = b*b;
		areaRetangulo = a*b; 
		
		System.out.printf("AREA DO TRIANGULO: %.3f%n",areaTriangulo);
		System.out.printf("AREA DO CIRCULO: %.3f%n",areaCirculo);
		System.out.printf("AREA DO TRAPÉZIO: %.3f%n",areaTrapezio);
		System.out.printf("AREA DO QUADRADO: %.3f%n",areaQuadrado);
		System.out.printf("AREA DO RETANGULO: %.3f%n",areaRetangulo);
		
		
	}

}
