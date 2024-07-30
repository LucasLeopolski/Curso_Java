/*
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
 * ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. 
 * Atenção: os números devem poder ser digitados em ordem crescente ou decrescente. 
 * */

package numerosMultiplos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		System.out.println("Informe dois números: ");
		a = ler.nextInt();
		b = ler.nextInt();
		
		if(a%b == 0 || b%a == 0){
			System.out.println("São multiplos!");
		}
		else {
			System.out.println("Não são multiplos!");
		}
		
		ler.close();
	}

}
