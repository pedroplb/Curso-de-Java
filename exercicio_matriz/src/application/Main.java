/*

Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.
3 4
10 8 15 12
21 11 23 8
14 5 13 19
8
Position 0,1:
Left: 10
Right: 15
Down: 11
Position 1,3:
Left: 23
Up: 12
Down: 19
*/

package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int qtdLinha, qtdColuna, matriz[][], numBuscado;
		
		System.out.println("Linhas");
		qtdLinha = sc.nextInt();

		System.out.println("Colunas");
		qtdColuna = sc.nextInt();
		
		matriz = new int[qtdLinha][qtdColuna];
		
		for (int i=0; i<qtdLinha; i++) {
			for(int j=0; j<qtdColuna; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMatriz digitada: ");
		
		for (int i=0; i<qtdLinha; i++) {
			for (int j=0; j<qtdColuna; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\nNúmero a buscar: ");
		numBuscado = sc.nextInt();

		for (int i = 0; i < qtdLinha; i++) {
			for (int j = 0; j < qtdColuna; j++) {
				if (matriz[i][j] == numBuscado) {
					System.out.println("\nPosição: " + i + ", " + j);

					if (i > 0) {
						System.out.println("Acima: " + matriz[i - 1][j]);
					}
					if (i < qtdLinha - 1) {
						System.out.println("Abaixo: " + matriz[i + 1][j]);

					}
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					if (j < qtdColuna - 1) {
						System.out.println("Direita: " + matriz[i][j + 1]);
					}
				}
			}
		}
		
		
		
		sc.close();

	}

}
