/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
 * o valor que recebe por hora e calcula o salário desse funcionário. 
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais. */

package horasTrabalhadas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int id;
		double horasTrabalhadas, valorHora,  salario;
		
		System.out.print("Qual o código do funcionário? ");
		id = ler.nextInt();
		
		System.out.print("Informe a quantidade de horas trabalhadas durante o mês: ");
		horasTrabalhadas = ler.nextDouble();
		
		System.out.print("Informe o valor da hora trabalhada: ");
		valorHora = ler.nextDouble();
		
		salario = horasTrabalhadas*valorHora;
		
		System.out.printf("O funcionário %d deverá receber R$ %.2f%n ", id, salario);
		
		
		ler.close();

	}

}
