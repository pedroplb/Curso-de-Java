package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		Double rendaAnual;
		Double gastoSaude;
		int totFuncionarios;
		Double totTaxa = 0.0;
		
		System.out.print("Entre o número de contribuintes: ");
		int qtdContribuinte = sc.nextInt();
		List<Pessoa> listPessoas = new ArrayList<>();	
		
		for(int i=1; i <= qtdContribuinte; i++) {
			System.out.println("Digite os dados do #" + i + " contribuinte");
			System.out.print("Pessoa Física ou Jurídica (f ou j)? ");
			String tipoPessoa = sc.next();
			
			System.out.print("Nome: ");
			nome = sc.next();
			
			System.out.print("Renda Anual: ");
			rendaAnual = sc.nextDouble();
			
			if (tipoPessoa.equals("f")) {
				System.out.print("Gastos com Saúde: ");
				gastoSaude = sc.nextDouble();
				listPessoas.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
				
			} else if (tipoPessoa.equals("j")) {
				System.out.print("Total de Funcionários: ");
				totFuncionarios = sc.nextInt();				
				listPessoas.add(new PessoaJuridica(nome, rendaAnual, totFuncionarios));
			}
		}
		
		System.out.println("\nTaxas Pagas:");
		for(Pessoa pes : listPessoas) {
			System.out.println(pes.getNome() + " $" + String.format("%.2f", pes.getImposto()));
			
			totTaxa += pes.getImposto();
			
		}
		
		System.out.println("\nTotal de Taxas:");
		System.out.println("$" + String.format("%.2f", totTaxa));

	}

}
