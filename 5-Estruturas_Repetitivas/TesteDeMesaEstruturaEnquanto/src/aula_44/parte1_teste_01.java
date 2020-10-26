/* OBSERVAÇÃO:
 * 
 * DIFERENÇAS!!!
 * 
 * ESTRUTURA 'if' EXECUTA SOMENTE UMA VEZ ENQUANTO A CONDIÇÃO FOR VERDADEIRA!
 * 
 * ESTRUTURA 'while' EXECUTA VÁRIAS VEZES ENQUANTO A CONDIÇÃO FOR VERDADEIRA, E FINALIZA QUANDO A CONDIÇÃO FOR NEGATIVA!
 * 
 */

package aula_44;

import java.util.Scanner;

public class parte1_teste_01 {

	public static void main(String[] args) {

		/* PROBLEMA EXEMPLO:
		 * 
		 * FAZER UM PROGRAMA QUE LÊ NÚMEROS INTEIROS ATÉ QUE UM ZERO SEJA LIDO.
		 * AO FINAL MOSTRA A SOMA DOS NÚMEROS LIDOS.
		*/
		
		Scanner imprimir = new Scanner(System.in);
		
		System.out.println("Digite outro número:");
		int numero = imprimir.nextInt();
		
		int soma = 0;
		
		while(numero != 0) {
			
			soma = soma + numero;
			System.out.println("Digite outro número:");
			numero = imprimir.nextInt();
			
		}
		
		System.out.println("SOMA: " + soma);
		
		
		imprimir.close();
		
	}
}
