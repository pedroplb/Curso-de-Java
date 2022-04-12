package entities;

public class PessoaFisica extends Pessoa{
	protected double gastoSaude;
	
	public PessoaFisica(String nome, Double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
		calculaImposto();
	}


	public double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public void calculaImposto() {
		
		if(this.rendaAnual < 20000) {
			setImposto(getRendaAnual() * 0.15 - (getGastoSaude() * 0.5));
		}else {
			setImposto(getRendaAnual() * 0.25 - (getGastoSaude() * 0.5));
		}
				
	}

}
