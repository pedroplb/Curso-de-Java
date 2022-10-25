package ExercicioProposto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		//cria a pasta
		File pasta = new File("C:\\Users\\pedro\\OneDrive\\Documents\\WS-Java\\exercícios\\src\\ExercicioProposto\\out");


		//Cria o arquivo
		File arquivo = new File("C:\\Users\\pedro\\OneDrive\\Documents\\WS-Java\\exercícios\\src\\ExercicioProposto\\out\\saida.csv");
		try {
			if (!pasta.exists()) {
				pasta.mkdirs();
				if (!arquivo.exists()) {
					arquivo.createNewFile();
				}
			}
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}

		String arquivoSaida = arquivo.toString();
		String[] produtoSeparado;
		double preco = 0;
		int qtdEstoque = 0;
		String arquivoEntrada = "C:\\Users\\pedro\\OneDrive\\Documents\\WS-Java\\exercícios\\src\\ExercicioProposto\\entrada.csv";
		FileReader  fr = null;
		BufferedReader br = null;

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSaida,true))){

			fr = new FileReader(arquivoEntrada);
			br =  new BufferedReader(fr);

			String linha = br.readLine(); 
			System.out.println(linha);

			while(linha != null) {

				produtoSeparado = linha.split(";");
				preco = Double.parseDouble(produtoSeparado[1].replaceAll(",","."));
				qtdEstoque = Integer.parseInt(produtoSeparado[2]);		

				Produto produto =  new Produto(produtoSeparado[0], preco, qtdEstoque);

				bw.write(produto.toString());
				bw.newLine();
				linha = br.readLine(); 

			}

			bw.close();
			fr.close();
			br.close();

			System.out.println("processamento concluído");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 

	}

}
