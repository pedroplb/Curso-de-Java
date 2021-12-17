package exercicio3;

import java.util.Locale;
import java.util.Scanner;

import entities.SituacaoAluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SituacaoAluno aluno = new SituacaoAluno();
		
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Digite a nota do primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.print("Digite a nota do segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.print("Digite a nota do terceiro trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.print(aluno.calculaSituacao());
		
		sc.close();

	}

}
