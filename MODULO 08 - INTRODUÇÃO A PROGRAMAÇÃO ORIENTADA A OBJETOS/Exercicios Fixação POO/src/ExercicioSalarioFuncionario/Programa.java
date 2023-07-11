/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
projetada abaixo.*/

package ExercicioSalarioFuncionario;

import java.util.Scanner;
import java.util.Locale;
import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Funcionario funcionario = new Funcionario();

		System.out.print("Nome: ");
		funcionario.nome = ler.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = ler.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = ler.nextDouble();

		System.out.println(funcionario.toString());

		System.out.print("\nQual percentual aumentar o salário: ");
		double porcentagem = ler.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		
		System.out.print("Dados atualizados: "+funcionario);

		ler.close();

	}

}
