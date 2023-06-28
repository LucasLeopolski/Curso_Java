/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System. in);
		Locale.setDefault(Locale.US);
		
		int codPeca1, codPeca2, qtddPeca1, qtddPeca2; 
		double valorUnitarioPeca1, valorUnitarioPeca2, valorPeca1, valorPeca2, valorTtl; 
		
		System.out.println("PRIMEIRA PEÇA:\nInforme o codigo da peça, a quantidade de peças compradas e o valor unitário de cada peça: ");
		codPeca1 = ler.nextInt();
		qtddPeca1 = ler.nextInt();
		valorUnitarioPeca1 = ler. nextDouble();
		
		System.out.println("SEGUNDA PEÇA:\nInforme o codigo da peça, a quantidade de peças compradas e o valor unitário de cada peça: ");
		codPeca2 = ler.nextInt();
		qtddPeca2 = ler.nextInt();
		valorUnitarioPeca2 = ler. nextDouble();
		
		valorPeca1 = valorUnitarioPeca1 * qtddPeca1; 
		valorPeca2 = valorUnitarioPeca2 * qtddPeca2; 
		
		valorTtl = valorPeca1 + valorPeca2; 
		
		System.out.printf("Valor a pagar: R$ %.2f ",valorTtl);
		
		ler.close();
	}

}
