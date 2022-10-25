package TrabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TrabalhandoComArquivo {

	public static void main(String[] args) {

		File arquivo = new File("C:\\Users\\pedro\\OneDrive\\Documents\\WS-Java\\exercícios\\src\\TrabalhandoComArquivos\\arquivo_de_teste.txt");
		Scanner sc = null;

		try {
			sc =  new Scanner(arquivo);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println("Error: " +e.getMessage());
		}
		finally {
			if (sc  !=null) {
				sc.close();
			}
		}

	}

}
