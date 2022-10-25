package TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrabalhandoComReader {

	public static void main(String[] args) {

		String caminho = ("C:\\Users\\pedro\\OneDrive\\Documents\\WS-Java\\exercícios\\src\\TrabalhandoComArquivos\\arquivo_de_teste.txt");
		FileReader  fr = null;
		BufferedReader br = null;

		try {
			fr=new FileReader(caminho);
			br = new BufferedReader(fr);

			String linha = br.readLine();

			while (linha !=null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e){
			System.out.println("Erro: " +e.getMessage());
		} finally {
			try{
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
