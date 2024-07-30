/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
 * sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração 
 * mínima de 1 hora e máxima de 24 horas. 
 * */

package duracaoJogo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double horaInicial, horaFinal, duracaoJogo; 
		
		System.out.println("Informe a hora inicial e a hora final do jogo: ");
		horaInicial = ler.nextDouble();
		horaFinal = ler.nextDouble();
		
		
		if(horaInicial < horaFinal) {
			duracaoJogo = horaFinal - horaInicial;
		}
		else {
			duracaoJogo = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("Duração do Jogo: " + duracaoJogo + " horas");
		
		ler.close();
	}

}
