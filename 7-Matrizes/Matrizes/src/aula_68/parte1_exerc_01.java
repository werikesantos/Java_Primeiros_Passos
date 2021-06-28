package aula_68;

import java.util.Locale;
import java.util.Scanner;

public class parte1_exerc_01 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem N
		 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade 
		 * de valores negativos da matriz.
		 * 
		 * Exemplos:
		 * 
		 * Entrada       Saída
		 * 3             DIAGONAL PRINCIPAL:
		 * 5 -3 10       5 8 -4
		 * 15 8 2        QUANTIDADE DE NEGATIVOS = 2
		 * 7 9 -4
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int matrizQuadrada = sc.nextInt();
		
		int[][] biDimensional = new int[matrizQuadrada][matrizQuadrada];
		
		for(int i=0; i<matrizQuadrada; i++){
			for(int j=0; j<matrizQuadrada; j++){
				biDimensional[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL: ");
		for(int i=0; i<matrizQuadrada; i++){
			System.out.print(biDimensional[i][i]+" ");
		}
		
		int count = 0;
		for(int i=0; i<matrizQuadrada; i++){
			for(int j=0; j<matrizQuadrada; j++){
				if(biDimensional[i][j] < 0){
					count++;
				}
			}
		}
		System.out.println("\nQUANTIDADE DE NEGATIVOS = "+count);
		
		/*
		System.out.print("\nLinha do meio: ");
		for(int i=0; i<1; i++){
			for(int j=0; j<matrizQuadrada; j++){
				System.out.print(biDimensional[1][j]+" ");
			}
		}
		
		System.out.print("\nColuna do meio: ");
		for(int i=0; i<matrizQuadrada; i++){
			for(int j=0; j<1; j++){
				System.out.print(biDimensional[i][1]+" ");
			}
		}*/

		sc.close();
	}
}