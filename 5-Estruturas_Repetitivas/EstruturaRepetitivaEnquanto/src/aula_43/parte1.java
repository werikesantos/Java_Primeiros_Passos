package aula_43;

import java.util.Locale;
import java.util.Scanner;

public class parte1 {

	public static void main(String[] args) {
		
	/* Problema exemplo:
	 * 
	 * Fazer um programa que l� n�meros inteiros at� que um zero seja lido. 
	 * Ao final mostra a soma dos n�meros lidos.
	 * 
	 * Entrada:                  Sa�da:
	 * 5                         11
	 * 2
	 * 4
	 * 0
	 * 
	 */
		
	Locale.setDefault(Locale.US); 
	Scanner sc = new Scanner(System.in);
	
	int soma = 0;
	int numero = sc.nextInt();
	
	while(numero > 0) {
		soma = soma + numero;
		numero = sc.nextInt();	
	}
	
	System.out.println(soma);
	
	sc.close();
	}

}
