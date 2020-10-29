package aula_54;

import java.util.Scanner;

public class parte1_exemplo_00 {

	public static void main(String[] args) {

		/* Problema exemplo:
		 * 
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. 
		 * Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
		 * 
		 * Fórmula: F = (9C / 5) + 32
		 * 
		 */
		
		Scanner dados = new Scanner(System.in);

		char resposta;
		do{
			System.out.println("Digite a temperatura em Celsius:");
			double celsius = dados.nextDouble();
			
			double fahrenheit = (((9.0 * celsius) / 5.0) + 32.0);
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			
			System.out.println("Deseja repetir (s/n)?");	
			resposta = dados.next().charAt(0);
			
		}while(resposta != 'n');	
	}
}