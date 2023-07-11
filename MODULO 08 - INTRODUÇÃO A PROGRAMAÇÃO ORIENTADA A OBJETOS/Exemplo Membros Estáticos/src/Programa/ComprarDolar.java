/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por 
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
*/

package Programa;

import java.util.Scanner;
import java.util.Locale;

import Programa.ConverterMoeda;

public class ComprarDolar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ConverterMoeda converter = new ConverterMoeda();

		System.out.print("Informe a cotação do Dólar: ");
		double precoDolar = ler.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantidadeDolar = ler.nextDouble();
		double resultado = ConverterMoeda.conversao(quantidadeDolar, precoDolar);
		System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);

		ler.close();
	}

}
