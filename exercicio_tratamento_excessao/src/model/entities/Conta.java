package model.entities;

import model.exception.SaldoException;

public class Conta {
	private int numConta;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta(int numConta, String titular, Double saldo, Double limiteSaque) {
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
		
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(Double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public String saque(Double valorSaque) throws SaldoException {
		
		if(valorSaque >  this.limiteSaque){
			throw new SaldoException("Valor solicitado $" + String.format("%.2f", valorSaque) 
									+ " excede seu limite disponpivel");
		}else if(valorSaque > this.saldo){
			throw new SaldoException("Valor solicitado $" + String.format("%.2f", valorSaque) 
									+ " excede seu saldo disponpivel");
		}
		
		this.saldo -= valorSaque;
		return ("Novo Saldo: $" + String.format("%.2f", this.saldo));
	}
	
}
