import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero; 
		
		System.out.println("Informe um número: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		}
		else {
			System.out.println("Número impar!");
		}
	}

}
