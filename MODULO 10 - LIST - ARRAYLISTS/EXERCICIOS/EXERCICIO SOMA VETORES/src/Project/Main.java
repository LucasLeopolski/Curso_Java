/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
- Imprimir todos os elementos do vetor 
- Mostrar na tela a soma e a média dos elementos do vetor
*/
package Project;

import java.util.Scanner;
import java.util.Locale; 

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double soma, media;
		

		System.out.println("Quantos números terá o vetor? ");
		int num = ler.nextInt();

		double vet[] = new double[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Informe um número: ");
			vet[i] = ler.nextDouble();

		}

		soma = 0;

		for (int i = 0; i < num; i++) {

			soma = soma + vet[i];
		}

		media = soma / num;

		System.out.print("VALORES: ");

		for (int i = 0; i < num; i++) {
			System.out.printf("%.1f ", vet[i]);
		}

		System.out.printf("\nSOMA: %.2f", soma);
		System.out.printf("\nMEDIA: %.2f", media);

		ler.close();

	}

}
