/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.*/

import java.util.Scanner; 
import java.util.Locale; 

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner( System.in); 
		Locale.setDefault(Locale.US);
		
		int numeroFuncionario;
		double horasTrabalhadas, valorHora, salario;
		
		System.out.println("Informe o número do funcionario, quantas horas trabalhadas e quanto o funcionario recebe por hora:");
		numeroFuncionario = ler.nextInt();
		horasTrabalhadas = ler.nextDouble();
		valorHora = ler.nextDouble();
		
		salario = horasTrabalhadas * valorHora; 
		
		System.out.println("NUMERO = "+numeroFuncionario );
		System.out.printf("SALARIO = U$  %.2f",salario);
		

	}

}
