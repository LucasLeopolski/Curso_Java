package entidades;

public class ContaBancaria {
	
	private int numConta; 
	private String nomeTitular;
	private double saldo; 
	
	public ContaBancaria() {}
	
	public ContaBancaria(int numConta, String nomeTitular) {
		
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	};
	
	public ContaBancaria(int numConta, String nomeTitular, double depositoInicial) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial); // está chamando o método deposito e atribuindo o valor do construtor a ele 
	} 
	
	public int getNumConta() {
		return numConta;
	}
	
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double deposito) {
		
		saldo += deposito;  // += é a mesma coisa que : saldo = saldo + deposito; 
		 
	}
	
	public void sacar (double saque) {
		
		saldo -= saque + 5.0;
	}
	
	public String toString(){
		
		return  "Conta "+getNumConta()+", Titular: "+getNomeTitular()+ ", Saldo: $"+String.format("%.2f", getSaldo());
	}

	
}