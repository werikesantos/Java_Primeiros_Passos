package aula_58;

import java.util.Locale;
import java.util.Scanner;

public class parte1_exerc_03 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número N, depois nome (apenas uma
		 * palavra sem espaços), idade e altura de N pessoas, conforme exemplo.
		 * Depois, mostrar na tela a altura média das pessoas, e mostrar também a
		 * porcentagem de pessoas com menos de 16 anos.
		 * 
		 * Exemplos:
		 * 
		 * Entrada              Saída
		 * 5                   	Altura média: 1.69
		 * Joao 15 1.82    		Pessoas com menos de 16 anos: 40.0%     
		 * Maria 16 1.60        
		 * Teresa 14 1.58
		 * Carlos 21 1.65
		 * Paulo 17 1.78
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(double altura : alturas){
			soma = soma + altura;
		}
		
		double media = soma / N;
		System.out.printf("Altura média: %.2f%n",media);
		
		int contar = 0;
		for(int idade : idades){
			if(idade < 16){
				contar++;
			}
		}
		double total = ((contar * 100) / N);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%",total);
		
		sc.close();
	}
}