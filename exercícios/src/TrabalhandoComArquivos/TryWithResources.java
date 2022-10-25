package TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {

		String caminho = ("C:\\Users\\pedro\\OneDrive\\Documents\\WS-Java\\exercícios\\src\\TrabalhandoComArquivos\\arquivo_de_teste.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String linha = br.readLine();

			while (linha !=null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e){
			System.out.println("Erro: " +e.getMessage());
		}

	}
}
