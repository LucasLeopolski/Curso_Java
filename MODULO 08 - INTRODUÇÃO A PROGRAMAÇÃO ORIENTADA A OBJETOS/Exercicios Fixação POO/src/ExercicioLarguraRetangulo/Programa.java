/*Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado*/

package ExercicioLarguraRetangulo;

import java.util.Scanner; 
import java.util.Locale; 
import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Informe a base do retangulo: ");
		retangulo.base = ler.nextDouble();
		System.out.println("\nInforme a altura do retangulo: ");
		retangulo.altura = ler.nextDouble();
		
		System.out.println(retangulo.toString());
	

		ler.close();
	}

}
