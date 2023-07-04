/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int num, primeiro, seg, terc; 
		
			System.out.println("Informe um número:");
			num = ler.nextInt();
			
			for(int i=1; i<=num; i++) {
				
				primeiro = i;
				seg = i*i;
				terc = i*i*i;
				
				System.out.println(primeiro+" - "+seg+" - "+terc);
				
			}
			
			
		
		ler.close();
	}

}
