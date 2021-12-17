/**
 * 
 */
package entities;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private double salario;
	
	public Funcionario(Integer id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public String nome() {
		return this.nome;
	}
	
	public double salario() {
		return this.salario;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void aumentoSal (double porcentagem) {
		double aumento;
		aumento = this.salario * porcentagem / 100;
		this.salario += aumento; 
	}
	
	public String toString() {
		return "\n " + this.id
		     + ", " + this.nome
		     + ", R$" + String.format("%.2f", this.salario);
		     
	}

}
