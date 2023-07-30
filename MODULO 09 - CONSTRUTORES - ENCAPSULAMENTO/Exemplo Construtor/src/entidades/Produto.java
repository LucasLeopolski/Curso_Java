package entidades;

public class Produto {
	private String nome;
	private double preco;
	private int qtddEstoque;

	public Produto(String nome, double preco, int qtddEstoque) {

		this.nome = nome;
		this.preco = preco;
		this.qtddEstoque = qtddEstoque;
	}

	public String getNome() {

		return nome;
	}

	public void String(String nome) {

		this.nome = nome;
	}

	public double getPreco() {

		return preco;
	}

	public void setPreco(double preco) {

		this.preco = preco;
	}

	public int getQtddEstoque() {

		return qtddEstoque;
	}

	public void setQtddEstoque(int qtddEstoque) {

		this.qtddEstoque = qtddEstoque;
	}

	public double valorTotalEstoque() {

		return preco * qtddEstoque;
	}

	public void addProdutos(int quantidade) {

		this.qtddEstoque = qtddEstoque + quantidade;

	}

	public void removerProdutos(int quantidade) {

		this.qtddEstoque = qtddEstoque - quantidade;
	}

	// este metodo toString vai imprimir na tela toda a descrição ja formatada, sem
	// eu precisar colocar no println tudo isso chamo apenas produto.toString(); ou
	// apenas produto
	public String toString() {

		return nome + ", $ " + String.format("%.2f", preco) + ", " + qtddEstoque + " unidades," + " TOTAL: $ "
				+ String.format("%.2f", valorTotalEstoque());

		// String.format("formatacao", variavel) - serve para definir a quantidade de
		// casas decimais que terá a minha variavel, mesma formatação do printF e o nome
		// da minha variavel.
	}

}
