/*Fazer um programa para ler uma temperatura em Celcius e mostrar o equivalente em Fahrenhiet. Perguntar se o usuário deseja repitir( S/N),
 * Caso o usuário digirte "S", repetir o programa
 *  FORMULA:   F= 9*C/5 + 32
 * */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double temp, f;
		char resp;

		do {

			System.out.println("Informe a temperatura em °C: ");
			temp = ler.nextDouble();

			f = 9 * temp / 5 + 32;

			System.out.printf("Equivalente em F: %.1f%n", f);

			System.out.println("Deseja repetir (s/n) ? ");
			resp = ler.next().charAt(0);
		} while (resp != 'n');

		ler.close();
	}

}
