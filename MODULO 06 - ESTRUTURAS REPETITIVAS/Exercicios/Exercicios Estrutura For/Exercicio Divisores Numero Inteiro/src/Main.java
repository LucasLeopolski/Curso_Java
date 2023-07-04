/*Ler um número inteiro N e calcular todos os seus divisores*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe um número: ");
		num = ler.nextInt();
		
		for(int i=1; i<=num; i++ ) {
			
			if(num % i == 0) {
				
				System.out.println("Divisiveis: "+i);
			}
		}
		
		
		
		ler.close();
	}

}
