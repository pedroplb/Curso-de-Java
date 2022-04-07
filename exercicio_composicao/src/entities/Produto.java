package entities;

public class Produto {
	String nome;
	Double preco;
	
	public Produto (String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return this.preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "Produto: " + nome + ", preco: " + preco + "]";
	}
	
	
	
}
