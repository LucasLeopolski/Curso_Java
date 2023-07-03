/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int x,num, dentro =0, fora =0; 
		
		System.out.println("Informe um número: ");
		x = ler.nextInt();
		
		for (int i = 0; i < x; i++) {
			
			System.out.println("Digite outro numero: ");
			num = ler.nextInt();
			
			if(num >=10 && num <=20) {
				dentro = dentro+1;
				
			}
			else {
				fora = fora +1;
			}
			
		}
		
		System.out.println("DENTRO: "+dentro+"\nFORA: "+fora);
		ler.close();
	}

}
