package application;

import java.util.Scanner;

import entites.Conta;

public class Main {

	public static void main(String[] args) {
		
		int numConta;
		String nome;
		double valor = 0;
		char depInicial;
		Conta conta;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com os dados da conta:");
		
		System.out.print("Entre com o titular da conta: ");
		nome = sc.next();
		
		System.out.print("Entre com o número da conta: ");
		numConta = sc.nextInt();
		
		System.out.print("Deseja fazer um depósito inicial (S ou N)? ");
		depInicial = sc.next().charAt(0);
		
		
		// declaração da conta do tipo Conta fora do if e sua instanciação dentro
		
		if (depInicial == 's' || depInicial == 'S') {
			System.out.print("Digite o valor do depósito inicial: ");
			valor = sc.nextDouble();
			conta = new Conta(nome, numConta, valor);
		} else {
			conta = new Conta(nome, numConta);
		}
		
			
		System.out.println(conta);
		
		System.out.print("Digite o valor do depósito: ");
		valor = sc.nextDouble();
		conta.deposito(valor);
		
		System.out.println(conta);
		
		System.out.print("Digite o valor do saque: ");
		valor = sc.nextDouble();
		conta.saque(valor);
		
		System.out.println(conta);
		
		sc.close();
	}

}
