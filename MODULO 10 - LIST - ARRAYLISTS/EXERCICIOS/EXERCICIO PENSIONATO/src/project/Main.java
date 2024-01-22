/*A dona de um pencionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados
pelos números 0 a 9. Fazer um programa que inicie com todos os dez quartos vazio, e depois leia uma quantidade N 
representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguidaregistre o aluguel 
dos estudantes, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha um relatório de todas as ocupações do
pensionato, por ordem de quarto, conforme o exemplo. */

package project;
import java.util.Scanner;
import entidades.Aluguel; 
public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Aluguel[] vet = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int quartosAlugados = ler.nextInt();
		
		for(int i=0; i<quartosAlugados; i++) {
			System.out.println("Aluguel #"+(i+1)+":");
			System.out.print("Nome: ");
			ler.nextLine(); // aqui está limpando a quebra de linha do Buffer 
			String nome = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.next();
			System.out.print("Quarto: ");
			int numeroQuarto = ler.nextInt();
			System.out.print("\n");
			Aluguel aluguel = new Aluguel(nome, email);
			vet[numeroQuarto] = aluguel; // aqui está dizendo que o vetor na posição do número do quarto esta recebendo os dados que eu instanciei
		}
		
		System.out.println("Quartos Ocupados: "); 
		for(int i=0; i<10; i++) {
			if(vet[i] != null) {
			System.out.println(i +":"+vet[i]);
			}
		}
	
		ler.close();

	}

}
