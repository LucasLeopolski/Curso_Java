/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
*/

package application;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num;
		System.out.print("Informe um número entre 1 e 10: ");
		num = ler.nextInt();

		if (num > 10) {
			System.out.println("Por favor, informe um valor entre 1 e 10");
			num = ler.nextInt();
		} else {

			int[] vet = new int[num];

			for (int i = 0; i < num; i++) {
				System.out.print("Infome um número para o vetor: ");
				vet[i] = ler.nextInt();

			}

			System.out.print("NÚMEROS NEGATIVOS: ");

			for (int i = 0; i < num; i++)
				if (vet[i] < 0) {
					Syst	em.out.print(vet[i] + ", ");

				}

		}
		ler.close();

	}
}
