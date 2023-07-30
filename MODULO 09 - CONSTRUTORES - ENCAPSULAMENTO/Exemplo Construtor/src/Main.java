import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Preço: ");
		double preco = ler.nextDouble();
		System.out.print("Quantidade em Estoque: ");
		int qtddEstoque = ler.nextInt();
		
		Produto produto = new Produto(nome, preco , qtddEstoque);
		
		System.out.println("\nDados do produto: "+produto.toString());
		
		System.out.println("\nInsira a quantidade de produtos que será adicionada ao estoque: ");
		qtddEstoque = ler.nextInt();
		produto.addProdutos(qtddEstoque);
		
		System.out.println("\nDados atualizados: "+produto.toString());
		
		System.out.println("\nInsira a quantidade de produtos que será removida do estoque: ");
		qtddEstoque = ler.nextInt();
		produto.removerProdutos(qtddEstoque);
		
		System.out.println("\nDados atualizados: "+produto.toString());
		
		ler.close();
		
	}

}