/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner( System.in); 
		
		int a, b,c,d, diferenca; 
		
		System.out.println("Informe 4 números: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();
		
		diferenca = (a*b - c*d);
		
		System.out.println("DIFERENÇA DO PRODUTO: "+diferenca);
	}

}
