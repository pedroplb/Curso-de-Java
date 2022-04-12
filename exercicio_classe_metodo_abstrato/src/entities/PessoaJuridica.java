package entities;

public class PessoaJuridica extends Pessoa {
	protected int numFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
		calculaImposto();
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public void calculaImposto() {
		
		if (this.numFuncionarios > 10) {
			setImposto(getRendaAnual() * 0.14);
		}else {
			setImposto(getRendaAnual() * 0.16);
		}
	}
	
}
