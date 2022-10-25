package TrabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TrabalhandoComEscrita {

	public static void main(String[] args) {
		
		String caminho = ("C:\\Users\\pedro\\OneDrive\\Documents\\WS-Java\\exercícios\\src\\TrabalhandoComArquivos\\arquivo_de_teste.txt");
// com true no file writer, empilha conteudo, sem true ele cria um novo ou sobrescreve um existente				
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			bw.newLine();
			String c;
			
			for(int i = 0; i<100; i++) {
				c = Integer.toString(i);
				bw.write(c);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
