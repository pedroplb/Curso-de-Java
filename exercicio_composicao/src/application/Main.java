package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import enums.StatusPedido;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		String nomeCliente = "";
		String email = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfHr = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date aniversario;
		int qtdItemPedido;
		String nomeProduto;
		Double preco;
		Date dataAtual = new Date();

		// dados do cliente
		System.out.println("Entre com os dados do cliente");
		System.out.print("Nome: ");
		nomeCliente = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Aniversário: ");
		aniversario = sdf.parse(sc.nextLine());

		Cliente cliente = new Cliente(nomeCliente, email, aniversario);

		// dados do pedido

		Pedido pedido = new Pedido(dataAtual, StatusPedido.valueOf("Processando"), cliente);

		System.out.print("Quantos itens compõe este pedido? ");
		int qtdItens = sc.nextInt();

		for (int i = 1; i <= qtdItens; i++) {

			System.out.println("Entre com o " + i + "# item do pedido");
			System.out.print("Nome do produto: ");
			nomeProduto =sc.next();
			System.out.print("Preço do produto: ");
			preco = sc.nextDouble();

			Produto produto = new Produto(nomeProduto, preco);

			System.out.print("Quantidade: ");
			qtdItemPedido = sc.nextInt();

			ItemPedido itemPedido = new ItemPedido(qtdItemPedido, produto);

			pedido.addItem(itemPedido);

		}

		// saída - falta os toStrings das classes e listar os itens do pedido

		System.out.println("Descrição do pedido: ");
		String stData = sdfHr.format(pedido.getMomento());
		System.out.println("Data Hora da criação do pedido: " + stData);
		System.out.println("Cliente: " + pedido.getCliente());
		
		List<ItemPedido> item = pedido.getItemPedido();
		System.out.println("Itens: ");
		int ip=0;
		for(int i = 0; i< item.size();i++) {	
			ip++;
			System.out.printf("Item #" + ip + ": " + item.get(i).toString());
		}		

	}

}
