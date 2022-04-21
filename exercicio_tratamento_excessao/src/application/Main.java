package application;

import java.util.Scanner;

import model.entities.Conta;
import model.exception.SaldoException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numConta;
		String titular;
		Double saldo;
		Double limiteSaque;
		Double valorSaque;
		
		try {
			System.out.println("Entre com os dados da conta:\n");
			System.out.print("Numero: ");
			numConta = sc.nextInt();
			System.out.print("Titular: ");
			titular = sc.next();
			System.out.print("Saldo Inicial: ");
			saldo = sc.nextDouble();
			System.out.print("Limite de Saque: ");
			limiteSaque = sc.nextDouble();
			
			Conta conta = new Conta(numConta, titular, saldo, limiteSaque);
			
			System.out.print("\nEntre com o valor para saque: ");
			valorSaque = sc.nextDouble();
			
			System.out.println(conta.saque(valorSaque));
			
		} catch (SaldoException e) {
			System.out.println("\n" + e.getMessage());
		} catch (RuntimeException e){
			System.out.println("\nVerifique os dados digitados e tente novamente");
		}
		
		sc.close();

	}

}
