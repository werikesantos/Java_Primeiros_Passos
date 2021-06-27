package aula_58;

import java.util.Locale;
import java.util.Scanner;

public class parte1_exerc_02 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor.
		 * Em seguida:
		 * - Imprimir todos os elementos do vetor
		 * - Mostrar na tela a soma e a média dos elementos do vetor
		 * 
		 * Exemplos:
		 * 
		 * Entrada              Saída
		 * 4                   	8.0 4.0 10.0 14.0
		 * 8.0 4.0 10.0 14.0    36.00      
		 *                      9.00
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vetor = new double[N];
		
		for(int i=0; i<N; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(double vet : vetor){
			System.out.print(vet+" ");
			soma = soma + vet;
		}
		System.out.printf("\n%.2f",soma);
		
		double media = soma / N;
		System.out.printf("\n%.2f",media);
		
		sc.close();
	}
}