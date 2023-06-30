/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double horaInicial, horaFinal, duracao;

		System.out.println("Informe a hora inicial e a hora final: ");
		horaInicial = ler.nextDouble();
		horaFinal = ler.nextDouble();

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

	}
}