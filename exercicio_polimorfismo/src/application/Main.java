package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Produto> listProd = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

		System.out.print("Digite a quantidade de produtos: ");
		int qtdProd = sc.nextInt();

		for(int i=1; i<=qtdProd; i++ ) {
			System.out.println("Digite os dados do #"+ i + " produto:");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			String tipoProd = sc.next();			

			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();

			switch(tipoProd) {
			case "c":
				listProd.add(new Produto(nome, preco));
				break;
			case "i":
				System.out.print("Taxa: ");
				Double taxa = sc.nextDouble();
				listProd.add(new ProdutoImportado(nome, preco, taxa));
				break;
			case "u":
				System.out.print("Data de fabricação (dd/mm/yyyy): ");
				Date dataFabrica = sdf.parse(sc.next());
				listProd.add(new ProdutoUsado(nome, preco, dataFabrica));
				break;
			default:
				break;				
			}

			
			}
		
		System.out.println("\nEtiquetas:");
		for (Produto prod: listProd) {
			System.out.println(prod.geraEtiqueta());
		}

	}

}
