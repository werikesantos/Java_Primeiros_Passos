package aula_49;

import java.util.Scanner;

public class parte1_exemp_00 {

	public static void main(String[] args) {

		/* Fazer um programa que l� um valor inteiro N e depois N n�meros inteiros.
		 * Ao final, mostra a soma dos N n�meros lidos.
		 * 
		 * ENTRADA			SAIDA
		 * 3				11
		 * 5
		 * 2
		 * 4
		 * 
		 */
		//OBS: A CONDI��O DE PARADA OCORRE QUANDO, O N�MERO DA VARI�VEL CONTADORA 'i', � MENOR  QUE O N�MERO DIGITADO PELO USU�RIO!
		//OU SEJA, SEU EU DIGITAR O N�MERO (4) EU POSSO ENTRAR COM 4 N�MEROS E NO FINAL MOSTRAR A SOMA DENTRE ESSES 4 N�MEROS DIGITADOS!!!
		Scanner dados = new Scanner(System.in);
		
		int umNumero = dados.nextInt();
		
		int soma = 0;
		for(int i = 0; i < umNumero; i++) {
			int variosNumeros = dados.nextInt();
			soma = soma + variosNumeros;
		}
		System.out.println(soma);
		dados.close();
	}
}