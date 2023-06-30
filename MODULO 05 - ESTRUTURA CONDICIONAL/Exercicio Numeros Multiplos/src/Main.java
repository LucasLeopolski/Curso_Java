/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2; 
		
		System.out.println("Informe dois números: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 ==0) {
			System.out.println("São multiplos");	
		}
		else {
			System.out.println("Não são multiplos");
		}
	}

}
