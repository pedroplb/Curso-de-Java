package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	protected Date dataFabricacao;
	SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
    public String geraEtiqueta() {
		return  this.nome + " (used) $" + String.format("%.2f",this.preco) + " (Data de Fabricação: " + sdf.format(dataFabricacao) + ")";
	}
	
 
}
