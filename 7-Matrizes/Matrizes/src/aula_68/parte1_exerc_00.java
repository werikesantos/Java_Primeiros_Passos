package aula_68;

import java.util.Locale;
import java.util.Scanner;

public class parte1_exerc_00 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler dois números inteiros positivos M e N, depois ler uma
		 * matriz de M linhas e N colunas contendo números inteiros. Em seguida, mostrar na 
		 * tela a matriz lida conforme exemplo.
		 * 
		 * Exemplos:
		 * 
		 * Entrada       Saída
		 * 2 3           6 3 10
		 * 6 3 10        8 12 5
		 * 8 12 5   
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		int[][] biDimensional = new int[linha][coluna];
		
		for(int i=0; i<linha; i++){
			for(int j=0; j<coluna; j++){
				biDimensional[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<linha; i++){
			for(int j=0; j<coluna; j++){
				System.out.print(biDimensional[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}