package entidades;

public class Aluguel {
	private String nome;
	private String email; 	

	
	
	public Aluguel() {
		
	}
	
	public Aluguel(String nome, String email) {
		this.nome = nome; 
		this.email = email;
	}
	
	public void getNome(String nome) {
		this.nome = nome; 
	}
	
	public String setNome() {
		return nome; 
	}
	
	public void getEmail(String email) {
		this.email = email; 
	}
	
	public String setEmail() {
		return email;
	}

	@Override
	public String toString() {
		return nome + ", " + email ;
	}
	
	
}
