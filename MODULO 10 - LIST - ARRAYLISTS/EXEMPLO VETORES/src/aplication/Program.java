/* Fazer um programa para ler um número inteiro N e a altura de N pessoas.
 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média das pessoas.
 */

package aplication;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("How many heights will you report? "); //Quantas alturas você irá informar?
		int n = ler.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Height: "); // Informe a altura:
			vect[i] = ler.nextDouble(); // aqui significa que o vect vai pegar
										// na posição do i, ou seja, posição 0,1,2... e vai passar
										// pra esta posição o número que for digitado;
		}

		double sum = 0.0; // variavel soma
		for (int i = 0; i < n; i++) {
			sum = sum + vect[i]; // vai percorrer o vetor e acumular a soma de todos aqui;

		}

		double media = sum / n;

		System.out.printf("AVERAGE HEIGHT= %.2f%n", media); // altura média
		ler.close();
	}

}
