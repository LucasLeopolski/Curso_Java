import java.util.Scanner;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Entarda de dados: TIPO - NUMERO INTEIRO");
		int numero;

		System.out.println("Informe um número inteiro: ");
		numero = ler.nextInt();

		System.out.println("Número informado: " + numero);

		System.out.println("============================================================");

		System.out.println("Entarda de dados: TIPO - TEXTO (STRING)");
		// A baixo, primeiro ele vai ler o nome depois vai apresentar na tela.
		String nome;
		nome = ler.next();
		System.out.println("Nome Informado: " + nome);

		System.out.println("============================================================");
		Locale.setDefault(Locale.US); // locale apenas vai apresentar o número com o ponto, mas para digitar teho que
										// usar a virgula.
		System.out.println("Entarda de dados: TIPO - NUMERO COM PONTO FLUTUANTE (. OU ,) - DOUBLE");

		double x;

		System.out.println("Informe um número com casas decimais: ");
		x = ler.nextDouble();

		System.out.printf("Número informado: %.2f%n", x);

		System.out.println("============================================================");
		System.out.println("Entarda de dados: TIPO - TEXTO (CHAR - CARACTER)");

		char sexo;

		System.out.println("Informe seu sexo: ");
		sexo = ler.next().charAt(0); // aqui ele está pegando uma entrada de dados do tipo STRING mas com a função
										// .charAt(0) vai pegar apenas o primeiro caracter digitado ( caso o usuario
										// digite mais de 1).

		System.out.println("SEU SEXO É: " + sexo);

		System.out.println("============================================================");
		System.out.println("Entarda de dados: TIPO - VARIOS TIPOS DE DADOS NA MESMA LINHA");
		// Locale.setDefault(Locale.US);

		int idade;
		String texto;
		double salario;
		char sex;

		System.out.println("Informe sua idade, seu nome, seu salário e seu sexo ( em sequencia): \n");
		idade = ler.nextInt();
		texto = ler.next();
		salario = ler.nextDouble();
		sex = ler.next().charAt(0);

		System.out.println("\nDados Informados: \n");
		System.out.println(idade);
		System.out.println(texto);
		System.out.printf("%.3f%n", salario);
		System.out.println(sex);
		
		
		System.out.println("============================================================");
		System.out.println("ENTARDA DE DADOS COM NEXTLINE");
		String teste; 
		String testeA; 
		
		System.out.println("valor de teste");
		teste=ler.nextLine();
		
		
		
		System.out.println("valor de a: ");	
		testeA=ler.nextLine();
		
		System.out.println("Valor de teste é: "+teste);
		System.out.println("valor de a é: " + testeA);
		

		ler.close();

	}

}
