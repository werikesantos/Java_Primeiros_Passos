package aula_58;

import java.util.Locale;
import java.util.Scanner;

public class parte1_exerc_00 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler um número inteiro positivo N, depois ler N números
		 * quaisquer e armazená-los em um vetor. Em seguida, mostrar na tela todos elementos 
		 * do vetor.
		 * 
		 * Exemplos:
		 * 
		 * Entrada       Saída
		 * 4             10.5
		 * 10.5          4.2
		 * 4.2           -7.1
		 * -7.1          15.0
		 * 15.0          
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vetor = new double[N];
		
		for(int i=0; i < N ; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		for(int i=0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		sc.close();
	}
}