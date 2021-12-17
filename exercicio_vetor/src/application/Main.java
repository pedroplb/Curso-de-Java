package application;

import java.util.Scanner;

import entities.Quarto;

public class Main {

	public static void main(String[] args) {

		int qtdAluga, numQuarto;
		Quarto listQuartos[] = new Quarto[10];
		String nome, email;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos serão alugados (no máximo 10)?");
		qtdAluga = sc.nextInt();

		if (qtdAluga > 0 && qtdAluga < 10) {
			for (int i = 1; i <= qtdAluga; i++) {

				System.out.printf("\nAluguel: " + i + "\n");

				System.out.print("Nome: ");
				nome = sc.next();

				System.out.print("Email: ");
				email = sc.next();

				System.out.print("Quarto: ");
				numQuarto = sc.nextInt();

				listQuartos[numQuarto] = new Quarto(nome, email, numQuarto);

			}
		} else {
			System.out.print("Quantidade não permitida");
		}
		
		System.out.print("Quartos alugados:");

		for (int i = 0; i < 10; i++) {
			
			if (listQuartos[i] != null) {
				System.out.print(listQuartos[i].toString() + "\n");
			}
			

		}
		
		sc.close();

	}
}