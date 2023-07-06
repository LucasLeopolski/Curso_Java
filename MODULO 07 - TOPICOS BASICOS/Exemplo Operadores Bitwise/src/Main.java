import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		/*aqui está pegando os números 89 e 60 e fazendo as comparações bitwise (bit a bit). Vai retornar na tela o resultado das comparações 
	 	 feitas entre o num1 e o num2, (no caso do bitwise V= 1 e F=0), 
	 	 está comparação vai ser feita pelos números binários equivalentes a 89 e 60 exemplo :
		 89 = 0101 1001 
		 60 = 0011 1100
		 *****SEMPRE FAZ A COMPARAÇÃO DA ESQUERDA PARA A DIREITA********
		 *
		 *COMPRAÇÃO COM OPERADOR &: (V quando os dois num forem V)  0001 1000 comparação retorna o num binário que equivale a 24; 
		 * 
		 * COMPARAÇÃO OPERADOR | (OU): (V quando pelo menos um num é V) 0111 1101 comparação retorna o num binário que equivale a 125;
		 * 
		 * COMPARAÇÃO OPERADOR ^ (OU EXCLUSIVO): (V quando SOMENTE um num é V) 0110 0101 comparação retorna o num binário equivalente a 101;
		*/
		
		int num1 = 89, num2 = 60;
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		/*essas comparações de baixo nível como um microcontrolador, interface com rede, arduido.  
		
		/*
		 * Exemplo a baixo: A pessoa vai programar uma interface com rede e precisa verificar um determinado bit do endereço da minha rede
		 * tem um número e preciso verificar se é verdadeiro ou falso ( 1,0). Aqui preciso verificar se o sexto bit é 0 ou 1, então eu crio uma mascara
		 * ( mascara é um numero que tem 0 em todos os seus números binários exceto no num que eu quero testar, aqui como queremos o 6° num utilizaremos o
		 * 32.  
		 * 
		 * */		
		int num;
		int mascara = 32; // posso declarar também utilizando o número binário: 0b00100000 -> equivale a 32 (preciso colocar o 0b p/ indicar que é binário) 
		
		System.out.println("Informe um número: ");
		num = ler.nextInt();
		
		if((num & mascara) != 0) {
			System.out.println("6° bit é verdadeiro! (equivale 1) ");
		}
		else {
			System.out.println("6° bit é falso! (equivale 0) ");
		}
		
		
		ler.close();

	}

}
