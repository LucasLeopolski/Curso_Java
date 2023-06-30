/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar*/
//Codigo       Especificação           Preço 
//1			Cachorro - Quente		R$ 4,00
//2			X-Salada				R$ 4,50
//3			X-Bacon					R$ 5,00
//4			Torrada Simples			R$ 2,00
//5			Refrigerante			R$ 1,50

import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int codigo, quantidade; 
		double total = 0.00;
		
		System.out.println("Informe o código do produto que você deseja: ");
		System.out.println("[1]Cachorro-Quente  R$ 4,00 \n[2]X-Salada R$ 4,50\n[3]X-Bacon R$ 5,00\n[4]Torrada R$ 2,00\n[5]Refrigerante R$ 1,50");
		codigo = ler.nextInt();
		
		System.out.println("Qual a quantidade? ");
		quantidade = ler.nextInt();
		
		if(codigo == 1) {
			total = quantidade * 4.00;
			
		}
		else if(codigo == 2) {
			total = quantidade * 4.50;
		}
		else if(codigo == 3) {
			total = quantidade * 5.00;
		}
		else if(codigo == 4) {
			total = quantidade * 2.00;
		}
		else if(codigo == 5) {
			total = quantidade * 1.50;
		}
		else {
			System.out.println("Informe um número válido!");
		}
		
		System.out.printf("Valor Total: R$ %.2f",total);
	}

}
