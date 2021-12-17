package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, qtdFuncionario, idAumento;
		double salario, porcentAumento;
		String nome;
		Funcionario funcionario;
		List<Funcionario> listFunc = new ArrayList<>();
		
		System.out.print("Quantos funcionarios serão registrados?: ");
		qtdFuncionario = sc.nextInt();
		
		for(int i=1; i<=qtdFuncionario; i++) {
			
			System.out.println("Funcionario #" + i + ":");
			
			System.out.print("Digite o ID: ");
			id = sc.nextInt();
			
			System.out.print("Digite o Nome: ");
			nome = sc.next();
			
			System.out.print("Digite o Salario: ");
			salario = sc.nextDouble();
			System.out.print("\n");
			
			funcionario = new Funcionario(id, nome, salario);
			listFunc.add(funcionario);									
		}
		
		System.out.print("\nDigite o ID do funcionário que receberá aumento: ");
		idAumento = sc.nextInt();
				
		Funcionario funcAumento = listFunc.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		
		if (funcAumento == null) {
			
			System.out.println("\nFuncionario Inexistente");
		}else {
			System.out.print("Digite a porcentagem de aumento: ");
			porcentAumento = sc.nextDouble();
			funcAumento.aumentoSal(porcentAumento);
		}
		
		System.out.print("\nLista de Funcionários:");
		
		for (Funcionario func : listFunc) {
			System.out.print(func);
		}
		
		sc.close();
		
	}

}
