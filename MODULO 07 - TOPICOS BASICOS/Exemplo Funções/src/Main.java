/*Fazer um programa para ler três numeros inteiros e retornar o maisr deles */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2, num3, maior;

		System.out.println("Informe três números: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
/* ********* FAZENDO O ALGOITIMO SEM FUNÇÃO "DA FORMA INICIAL" ***********
 * 
		if (num1 > num2 && num1 > num3) {

			maior = num1;
		} else if (num2 > num3) {

			maior = num2;
		} else {

			maior = num3;
		}

		System.out.println("MAIOR: " + maior);*/
		
	// ********* FAZENDO O ALGOITIMO E CHAMANDO APENAS AS FUNÇÕE QUE FORAM FEITAS A BAIXO ************
		
		int higher = max(num1 ,num2 , num3);
		
		showResult(higher);
		

		ler.close();

	}

	public static int max(int x, int y, int z) {
		int aux;

		if (x > y && x > z) {

			aux = x;
		} else if (y > z) {

			aux = y;
		}

		else {
			aux = z;
			
		}
		
		return aux;
	}
	
	public static void showResult(int valor) {
		
		System.out.println("MAIOR: "+valor);
	}

}
