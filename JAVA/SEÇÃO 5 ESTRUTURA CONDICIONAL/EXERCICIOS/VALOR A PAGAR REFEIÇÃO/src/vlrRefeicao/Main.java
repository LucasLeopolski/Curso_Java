/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar. 
 * */



package vlrRefeicao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int item, quantidade; 
		double vlrAPagar;
		
		System.out.println("Codigo		|| Item				|| Preço");
		System.out.println("  1		|| Cachorro Quente		|| R$ 4.00");
		System.out.println("  2		|| X-Salada			|| R$ 4.50");
		System.out.println("  3		|| X-Bacon			|| R$ 5.00");
		System.out.println("  4		|| Torrada			|| R$ 2.00");
		System.out.println("  5		|| Refrigerante			|| R$ 1.50");
		System.out.println("----------------------------------------------------------");
		
		System.out.print("\nInforme o código do item desejado: ");
		item = ler.nextInt();
		
		
		double total = 0; 
		switch (item) {
		case 1: {
			System.out.print("Informe a quantidade: "); 
			quantidade = ler.nextInt();
			
			total = quantidade * 4.00;  
			break;
		}
		case 2: {
			System.out.print("Informe a quantidade: "); 
			quantidade = ler.nextInt();
			
			total = quantidade * 4.50;
			break;
		}
		case 3: {
			System.out.print("Informe a quantidade: "); 
			quantidade = ler.nextInt();
			
			total = quantidade * 5.00;
			break;
		}
		case 4: {
			System.out.print("Informe a quantidade: "); 
			quantidade = ler.nextInt();
			
			total = quantidade * 2.00;
			break;
		}
		case 5: {
			System.out.print("Informe a quantidade: "); 
			quantidade = ler.nextInt();
			
			total = quantidade * 1.50;
			break;
		}
		default:
			System.out.println("Informe um código valido: ");
			break;
		}
		
		if(item >= 1 & item <=5) {
		System.out.printf("Total a pagar: R$ %.2f", total);
		
		}
		ler.close();
	}

}
