import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int horas;

		System.out.println("Informe as horas: ");
		horas = ler.nextInt();
		ler.nextLine();

		if (horas < 12) {
			System.out.println("Bom dia!");

		} else if (horas < 18) {
			System.out.println("Boa tarde!");
			
		} else
			System.out.println("Boa noite");

		ler.close();
	}

}
