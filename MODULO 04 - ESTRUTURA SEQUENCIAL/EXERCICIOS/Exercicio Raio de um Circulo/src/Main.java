/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio*raio
Considere o valor de π = 3.1415*/

import java.util.Scanner;
import java.util.Locale; 

public class Main {

	public static void main(String[] args) {		
		Scanner ler = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double raio, area, pi = 3.14159;
		
		System.out.println("Inofrme o raio do circulo: ");
		raio = ler.nextDouble();
		
		area = pi * raio * raio; 
		
		System.out.printf("%nÁrea = %.4f ", area);
		
		
		ler.close();
	}

}
