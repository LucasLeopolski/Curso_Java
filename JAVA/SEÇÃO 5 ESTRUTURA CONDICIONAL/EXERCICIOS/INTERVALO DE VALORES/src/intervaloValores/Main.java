/*
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo 
 * em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
 * Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem 
 * “Fora de intervalo”. 
 * */

package intervaloValores;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int valor; 
		
		System.out.println("Informe um valor: ");
		valor = ler.nextInt();
		
		if(valor < 0.0  || valor > 100.0 ) {
			System.out.println("Fora do intervalo!");
		}
		else if( valor <= 25) {
			System.out.println("Encontra-se no primeiro intervalo [0,25]! ");
			
		}
		else if(valor <= 50) {
			System.out.println("Encontra-se no segundo intervalo [25,50]! ");
			
		}
		else if(valor <= 75) {
			System.out.println("Encontra-se no terceiro intervalo [50, 75]! ");
			
		}
		else {
			System.out.println("Encontra-se no quarto intervalo [75,100]! ");
			
		}
		
		ler.close();	
		

	}

}
