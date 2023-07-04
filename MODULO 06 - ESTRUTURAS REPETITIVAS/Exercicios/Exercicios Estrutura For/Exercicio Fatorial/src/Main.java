/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n, fatorial=1;
		
		System.out.println("Qual o tamanho do programa? ");
		n = ler.nextInt();
		
		for(int i=1; i<=n; i++) {
			fatorial = fatorial *i;
			
		}
		System.out.println("FATORIAL: "+fatorial);
		
		ler.close();

	}

}
