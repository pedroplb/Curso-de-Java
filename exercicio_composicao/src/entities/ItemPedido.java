package entities;

public class ItemPedido {
	int quantidade;
	Produto produto;
	Double subtotal;
	
	public ItemPedido(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
		subTotal();
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void subTotal() {
		this.subtotal = this.quantidade * this.produto.getPreco();
}

	public String toString() {
		return "Quantidade: " + quantidade + ", " + " Produto: " + this.produto.getNome() + ", Preço: $" + this.produto.getPreco() + ", Subtotal: $" + this.subtotal;
	}
	
	

}
