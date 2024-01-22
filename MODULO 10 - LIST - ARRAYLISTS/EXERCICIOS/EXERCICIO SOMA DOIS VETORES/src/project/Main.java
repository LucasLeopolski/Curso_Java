/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
o vetor C gerado.
 */
package project;
 
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int tamanhoVet; 
		
		System.out.print("Quantas posições terão os vetores? ");
		tamanhoVet = ler.nextInt();
		
		int vetA[] = new int [tamanhoVet];
		int vetB[] = new int [tamanhoVet];
		int vetC[] = new int [tamanhoVet];
		
		
		System.out.println("Informe os valores do vetor A: ");
		for(int i=0; i<tamanhoVet; i++) {
			vetA[i] = ler.nextInt();
			}
		
		System.out.println("Informe os valores do vetor B: ");
		for(int i=0; i<tamanhoVet; i++) {
			vetB[i] = ler.nextInt();
			
		}
		
		System.out.println("Vetor Resultante: ");
		for(int i=0; i<tamanhoVet; i++) {
			vetC[i] = vetA[i] + vetB[i];
			
			System.out.println(vetC[i]);
		}
		
		
		ler.close();

	}

}
