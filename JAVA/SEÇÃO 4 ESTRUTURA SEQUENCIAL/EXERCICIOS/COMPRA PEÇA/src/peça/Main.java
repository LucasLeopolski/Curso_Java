/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o 
 *valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor 
 *unitário de cada peça 2. Calcule e mostre o valor a ser pago. 
 * 
 * */package peça;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int cod1, cod2, qtdd1, qtdd2;
		double vlrPeca1, vlrPeca2, vlrPagar;
		double vlrPagarPeca1, vlrPagarPeca2;
		
		System.out.println("Informe o código, a quantidade comprada e o valor unitário da primeira peça:");
		cod1 = ler.nextInt();
		qtdd1 = ler.nextInt();
		vlrPeca1 = ler.nextDouble();
		
		System.out.println("Informe o código, a quantidade comprada e o valor unitário da segunda peça:");
		cod2 = ler.nextInt();
		qtdd2 = ler.nextInt();
		vlrPeca2 = ler.nextDouble();
		
		vlrPagarPeca1 = qtdd1 * vlrPeca1;
		vlrPagarPeca2 = qtdd2 * vlrPeca2;
		
		vlrPagar = vlrPagarPeca1 + vlrPagarPeca2;
		
		System.out.printf("Valor a pagar: R$ %.2f ", vlrPagar);
		
		
		ler.close();

	}

}
