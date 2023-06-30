/*Fazer um programa para ler um número inteiro de 1 á 7 e retornar o dia da semana referente ao número*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num = ler.nextInt();
		String dia;

		switch (num) {
		case 1:
			dia = "domingo";
			break;

		case 2:
			dia = "segunda";
			break;
		
		case 3: 
			dia = "terça";
			break;
			
		case 4: 
			dia = "quarta";
			break;
			
		case 5:
			dia = "quinta";
			break;
			
		case 6: 
			dia = "sexta";
			break;
			
		case 7: 
			dia = "sábado";
			break;
			
		default:
			dia = "Informe um válor válido, (1 á 7).";
			
		}
		
		System.out.println("Dia da semana: "+dia);
		
		ler.close();

	}
}
