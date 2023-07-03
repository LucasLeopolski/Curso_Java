/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int senha ;
		
		System.out.println("Informe a senha: ");
		senha = ler.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inválida! Tente novamente.");
			senha = ler.nextInt();
		}
		
		System.out.println("Senha correta! Seja bem vindo.");
		
		ler.close();

	}

}
