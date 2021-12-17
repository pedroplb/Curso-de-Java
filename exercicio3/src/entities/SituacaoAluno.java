package entities;

public class SituacaoAluno {
	
	public double nota1;
	public double nota2;
	public double nota3;
	public double resultado;
	public String situacao;
	public String nome;
	
	public String calculaSituacao() {
		
		resultado = nota1 + nota2 + nota3;
		
		if (resultado >= 60.00) {
			
			situacao = "Aprovado - Nota Final: " + resultado;
		}else {
			situacao = "\n" + "Reprovado - Nota Final: " + resultado + "\n" 
					 + "Faltou " + (60.00 - resultado) + " para a aprovação";
		}
				
		return situacao;
		
	}
	
	
	
	
	
	
	

}
