/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver. 
*/
package project;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int num, contagemPessoas;
		double mediaAlturas, soma, porcentagemPessoas;

		System.out.print("Quantas pessoas você irá informar? ");
		num = ler.nextInt();

		String nome[] = new String[num];
		int idade[] = new int[num];
		double altura[] = new double[num];

		for (int i = 0; i < num; i++) {
			System.out.println("\nDados da " + (i + 1) + "ª pessoa: ");
			System.out.print("Nome: ");
			nome[i] = ler.next();
			System.out.print("Idade: ");
			idade[i] = ler.nextInt();
			System.out.print("Altura: ");
			altura[i] = ler.nextDouble();

		}
		soma = 0.0;

		for (int i = 0; i < num; i++) {

			soma += altura[i];
		}
		mediaAlturas = soma / num;

		System.out.printf("\nAltura média: %.2f", mediaAlturas);

		contagemPessoas = 0;
		for (int i = 0; i < num; i++) {
			if (idade[i] < 16) {
				contagemPessoas = contagemPessoas + 1;

			}
		}

		porcentagemPessoas = contagemPessoas * 100.0 / num;

		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%%n", porcentagemPessoas);

		for (int i = 0; i < num; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

		ler.close();
	}

}
