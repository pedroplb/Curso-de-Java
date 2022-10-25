package ExercicioProposto;

import java.text.DecimalFormat;

public class Produto {
	private String nome;
	private double preco;
	private int qtdeEstoque;
	private double valorEstoque;
	
	public Produto (String nome, double preco, int qtdEstoque){
		this.nome = nome;
		this.preco = preco;
		this.qtdeEstoque = qtdEstoque;
		SetValorEstoque();
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public double getPreco () {
		return this.preco;
	}
	
	public int getQtdeEstoque() {
		return this.qtdeEstoque;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
	
	public void setQtdEstoque (int qtdEstoque) {
		this.qtdeEstoque = qtdEstoque;
	}

	private void SetValorEstoque(){
		
		this.valorEstoque = this.preco * this.qtdeEstoque;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return this.nome + ";" +  df.format(this.valorEstoque).toString();
	}
	
	
}
