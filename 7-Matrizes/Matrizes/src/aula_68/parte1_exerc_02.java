package aula_68;

import java.util.Locale;
import java.util.Scanner;

public class parte1_exerc_02 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz
		 * de M linhas e N colunas contendo números double. Gerar um vetor de modo que cada 
		 * elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
		 * Mostrar o vetor gerado.
		 * 
		 * Exemplos:
		 * 
		 * Entrada        Saída
		 * 2 3            25.0
		 * 7.0 8.0 10.0   10.0
		 * 2.0 3.0 5.0   
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		
		double[][] biDimensional = new double[M][N];
		
		for(int i=0; i<M; i++){
			for(int j=0; j<N; j++){
				biDimensional[i][j] = sc.nextDouble();
			}
		}
		
		double[] vetor = new double[M];
		
		for(int i=0; i<M; i++){
			double soma=0.0;
			for(int j=0; j<N; j++){
				soma = soma +biDimensional[i][j];
			}
			vetor[i] = soma;
		}
		
		for(int i=0; i<M; i++){
			System.out.print(vetor[i]+"\n");	
		}
		
		sc.close();
	}
}