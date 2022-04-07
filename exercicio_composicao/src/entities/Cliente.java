package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	String nome;
	String email;
	Date aniversario;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String stData;
	
	public Cliente (String nome, String email, Date aniversario){
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String email() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		stData = sdf.format(aniversario);
		return "	Nome: " + nome + " \n"
				+ "		Email: " + email + " \n"
				+ "		Aniversario: " + stData ;
	}
	
}
