/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do 
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito 
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua 
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já 
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por 
exemplo). 
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger 
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque 
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for 
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre 
mostrando os dados da conta após cada operação.

*/package programa;

import java.util.Scanner;
import java.util.Locale;
import entidades.ContaBancaria;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		ContaBancaria conta;
		
		System.out.print("Informe o número da conta: ");
		int numConta = ler.nextInt();
	
		
		System.out.print("Informe o nome do titular da conta: ");
		ler.nextLine(); // para consumir a quebra de linha do nextInt
		String nomeTitular = ler.nextLine();
		
		System.out.print("Você deseja fazer um depósito inicial? (s/n) ");
		char deposito = ler.next().charAt(0);
		
		if (deposito == 's') {
			System.out.print("Informe o valor do depósito: ");
			double depositoInicial = ler.nextDouble();
			 conta = new ContaBancaria(numConta, nomeTitular , depositoInicial);
			
		}
		else {
			
			conta = new ContaBancaria(numConta, nomeTitular);
		}
		
		System.out.println("\nDADOS ATUALIZADOS DA CONTA: ");
		System.out.println(conta.toString());
		
		System.out.print("\nInforme o valor depósito: ");
		double valorDeposito = ler.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("\nDADOS ATUALIZADOS DA CONTA: ");
		System.out.print(conta);
		
		System.out.print("\nInforme o valor do saque: ");
			double Valorsaque = ler.nextDouble();
			conta.sacar(Valorsaque);
			
			System.out.println("\nDADOS ATUALIZADOS DA CONTA: ");
			System.out.print(conta.toString());		
			
			
		ler.close();
	}

}

