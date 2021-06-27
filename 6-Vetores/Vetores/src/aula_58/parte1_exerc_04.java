package aula_58;

import java.util.Locale;
import java.util.Scanner;

public class parte1_exerc_04 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um valor N e depois o nome de N pessoas.
		 * Em seguida, mostrar os nomes lidos.
		 * 
		 * Exemplos:
		 * 
		 * Entrada              Sa�da
		 * 3                   	Nomes lidos:
		 * Maria    			Maria  
		 * Joaquim				Joaquim        
		 * Ana					Ana
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
		}
		
		System.out.println("Nomes lidos:");
		for(String nome : nomes){
			System.out.println(nome);
		}

		sc.close();
	}
}