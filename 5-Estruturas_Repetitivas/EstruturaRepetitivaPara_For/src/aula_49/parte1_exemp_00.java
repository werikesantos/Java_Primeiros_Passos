package aula_49;

import java.util.Scanner;

public class parte1_exemp_00 {

	public static void main(String[] args) {

		/* Fazer um programa que lê um valor inteiro N e depois N números inteiros.
		 * Ao final, mostra a soma dos N números lidos.
		 * 
		 * ENTRADA			SAIDA
		 * 3				11
		 * 5
		 * 2
		 * 4
		 * 
		 */
		//OBS: A CONDIÇÃO DE PARADA OCORRE QUANDO, O NÚMERO DA VARIÁVEL CONTADORA 'i', É MENOR  QUE O NÚMERO DIGITADO PELO USUÁRIO!
		//OU SEJA, SEU EU DIGITAR O NÚMERO (4) EU POSSO ENTRAR COM 4 NÚMEROS E NO FINAL MOSTRAR A SOMA DENTRE ESSES 4 NÚMEROS DIGITADOS!!!
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