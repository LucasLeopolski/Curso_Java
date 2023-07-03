/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5.*/

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int num;

		double a, b, c, media = 0.0;

		System.out.println("Informe um número: ");
		num = ler.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("\nInforme 3 números reais: ");
			a = ler.nextDouble();
			b = ler.nextDouble();
			c = ler.nextDouble();

			media = ((a * 2) + (b * 3) + (c * 5)) / 10;

			System.out.printf("Media: %.1f ", media);

		}

		ler.close();
	}

}
