/*Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostrar a soma dos números inteiros lidos;*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n, soma, num;

		System.out.println("Informe um número: ");
		n = ler.nextInt();

		soma = 0;

		for (int i = 0; i < n; i++) {

			num = ler.nextInt();
			soma = soma + num;

		}

		System.out.println("SOMA: "+soma);

		ler.close();
	}

}
