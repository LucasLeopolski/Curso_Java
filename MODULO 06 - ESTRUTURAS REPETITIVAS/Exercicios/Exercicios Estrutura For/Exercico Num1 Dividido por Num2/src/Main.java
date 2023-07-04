/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"*/

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n, num1, num2;
		double div;

		System.out.println("Qual o tamanho do progarma? ");
		n = ler.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nInforme dois números: ");
			num1 = ler.nextInt();
			num2 = ler.nextInt();

			div = (double) num1 / num2;

			if (num2 == 0) {

				System.out.println("Divisão impossivél!");
			} else {

				System.out.printf("Divisão: %.1f", div);
			}

		}
		
		ler.close();

	}

}
