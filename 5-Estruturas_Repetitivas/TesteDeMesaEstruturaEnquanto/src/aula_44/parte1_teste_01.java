/* OBSERVA��O:
 * 
 * DIFEREN�AS!!!
 * 
 * ESTRUTURA 'if' EXECUTA SOMENTE UMA VEZ ENQUANTO A CONDI��O FOR VERDADEIRA!
 * 
 * ESTRUTURA 'while' EXECUTA V�RIAS VEZES ENQUANTO A CONDI��O FOR VERDADEIRA, E FINALIZA QUANDO A CONDI��O FOR NEGATIVA!
 * 
 */

package aula_44;

import java.util.Scanner;

public class parte1_teste_01 {

	public static void main(String[] args) {

		/* PROBLEMA EXEMPLO:
		 * 
		 * FAZER UM PROGRAMA QUE L� N�MEROS INTEIROS AT� QUE UM ZERO SEJA LIDO.
		 * AO FINAL MOSTRA A SOMA DOS N�MEROS LIDOS.
		*/
		
		Scanner imprimir = new Scanner(System.in);
		
		System.out.println("Digite outro n�mero:");
		int numero = imprimir.nextInt();
		
		int soma = 0;
		
		while(numero != 0) {
			
			soma = soma + numero;
			System.out.println("Digite outro n�mero:");
			numero = imprimir.nextInt();
			
		}
		
		System.out.println("SOMA: " + soma);
		
		
		imprimir.close();
		
	}
}
