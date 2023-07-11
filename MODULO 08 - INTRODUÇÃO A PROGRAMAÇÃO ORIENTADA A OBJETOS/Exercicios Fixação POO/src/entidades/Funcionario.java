package entidades;

public class Funcionario {
	
	public String nome; 
	public double salarioBruto;
	public double imposto; 
	
	public double salarioLiquido() {
		
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		
		 salarioBruto += salarioBruto * porcentagem /100.0; 
	}
	
	public String toString() {
		return "FUNCIONARIO: "+ nome + ", SALARIO: $ " + String.format("%.2f", salarioLiquido());
		
	}
}
