/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
resolver este problema*/
package ExercicioNotasAluno;

import java.util.Scanner;
import java.util.Locale;
import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do do aluno: ");
		aluno.nome = ler.nextLine();
		
		System.out.println("Informe as três notas do aluno: ");
		aluno.nota1 = ler.nextDouble();
		aluno.nota2 = ler.nextDouble();
		aluno.nota3 = ler.nextDouble();
		
		System.out.println("\nNOTA FINAL: " + aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			
			System.out.println("NÃO ATINGIU A MÉDIA");
			System.out.printf("Faltou %.2f",aluno.resultado());
			
		}
		else {
			
			System.out.println("APROVADO (A)");
		}

	}

}
