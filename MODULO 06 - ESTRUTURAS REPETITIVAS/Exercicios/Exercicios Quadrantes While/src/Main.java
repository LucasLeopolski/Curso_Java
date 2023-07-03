/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int x, y;

		System.out.println("Informe dois números: ");
		x = ler.nextInt();
		y = ler.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante!");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante!");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante!");

			} else {
				System.out.println("Quarto Quadrante!");
			}

			System.out.println("Informe novamente os números: ");
			x = ler.nextInt();
			y = ler.nextInt();

		}

		ler.close();
	}

}
