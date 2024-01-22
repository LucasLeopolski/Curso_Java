/*Fazer um programa para ler um número inteiro N e os dados (nome e preço) 
 * de N produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
 */
package aplication;

import java.util.Scanner;
import java.util.Locale;
import entidades.Produto;
public class Programa {

	


		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			Locale.setDefault(Locale.US);

			System.out.println(" Quantos itens vai digitar?"); 
			int n = ler.nextInt();

			Produto[] vetor = new Produto[n];
			for (int i = 0; i < vetor.length; i++) { // length é o tamanho do vetor
				ler.nextLine(); // quebra de linha pendente no nextInt la de cima, aqui só está consumindo essa quebra de linha
				System.out.println("Informe o nome do produto: "); 
				String nome = ler.nextLine(); 
				System.out.println("Informe o preço do produto: "); 
				double preco = ler.nextDouble(); 
				
				vetor[i] = new Produto (nome,preco);
			}

			double soma = 0.0; 
			for (int i = 0; i < vetor.length; i++) {
				soma = soma + vetor[i].getPreco(); 

			}

			double media = soma / n;

			System.out.printf("MÉDIA DOS PREÇOS= %.2f%n", media); 
			ler.close();
		}
}