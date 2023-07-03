/* Fazer um programa para ler a entrada de numeros inteiros até que um zero seja lido. Mostrar a soma dos números lidos*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, soma;

		System.out.println("Informe um número: ");
		num = ler.nextInt();

		soma = 0;

		while (num != 0) {
			
			soma = soma + num;
			System.out.println("Informe outro número: ");
			num = ler.nextInt();
			

		}

		System.out.println("A soma dos números informados é: " + soma);
		
		
		ler.close();
	}

}
