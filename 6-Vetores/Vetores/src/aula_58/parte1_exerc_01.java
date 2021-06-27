package aula_58;

import java.util.Locale;
import java.util.Scanner;

public class parte1_exerc_01 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que leia N n�meros inteiros e armazene-os
		 * em um vetor. Em seguida, mostrar na tela todos os n�meros 
		 * negativos lidos.
		 * 
		 * Exemplos:
		 * 
		 * Entrada              Sa�da
		 * 6                    -2
		 * 8 -2 9 10 -3 -7      -3      
		 *                      -7
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] vetor = new int[N];
		
		for(int i=0; i<N; i++) {
			vetor[i] = sc.nextInt();
		}
		
		for(int vet : vetor){
			if(vet < 0) {
				System.out.println(vet);
			}
		}
		
		sc.close();
	}
}