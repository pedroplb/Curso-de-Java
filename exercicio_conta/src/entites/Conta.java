package entites;

public class Conta {
	
	private String nome;
	private int numConta;
	private double valor;
	private double saldo;

//construtores	
	public Conta(String nome, int numConta, double valor) {
		this.nome = nome;
		this.numConta = numConta;
		this.valor = valor;		
		deposito(this.valor);
	}
	
	public Conta(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}


//get e  set	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getConta() {
		return this.numConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
// saque e deposito	
	public void deposito(double valor) {
		this.saldo +=valor;
	}
	
	public void saque(double valor) {
		this.saldo = saldo - valor - 5;
	}

// devolver os dados formatados da classe
	public String toString() {
		return "Dados da conta: \n" 
			+ "Número da conta: " + this.numConta + ", "
	                 + "Titular: " + this.nome + ", "
	                + "Saldo: R$" + String.format("%.2f",this.saldo) + "\n";
	}

}
