package entities;

public class ProdutoImportado extends Produto{
	protected Double taxa;

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
		setPrecoTotal();
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	
	@Override
    public String geraEtiqueta() {
		return  this.nome + " $" + String.format("%.2f",this.preco) + " (Taxa: $" + String.format("%.2f",this.taxa) + ")";
	}
	
	public void setPrecoTotal() {
		this.preco += this.taxa;
	}

}
