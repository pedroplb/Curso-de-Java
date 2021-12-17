package entities;

public class Quarto {
	private String nome;
	private String email;
	private int numQuarto;
	
	
	public Quarto(String nome, String email, int numQuarto) {
		this.nome = nome;
		this.email = email;
		this.numQuarto = numQuarto;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	public String getEmail() {
		return this.email;
	}
	
	public int getNumQuarto() {
		return this.numQuarto;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public void setNumQuarto(int numQuarto) {
		this.numQuarto  = numQuarto;
	}

    public String toString() {
    	return "\nNome:   " + this.nome + "\n"
    	     +   "Email:  " + this.email + "\n"
    	     +   "Quarto: " + this.numQuarto ;
    }
	
	
	
	

	


}
