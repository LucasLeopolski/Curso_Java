/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.*/

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int num1, num2, soma; 
		
		System.out.println("Informe dois números: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("SOMA = "+soma);
		
		ler.close();
		
		
	}

}
