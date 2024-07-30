/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos
 * */

package somaInteiros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num1, num2, soma;
		
		System.out.println("Informe o primeiro valor: ");
		num1 = sc.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("SOMA = " + soma);
		

	}

}
