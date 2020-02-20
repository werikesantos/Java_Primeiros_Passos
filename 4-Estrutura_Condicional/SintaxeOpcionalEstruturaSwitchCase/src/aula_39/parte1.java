package aula_39;

import java.util.Locale;
import java.util.Scanner;

public class parte1 {

	public static void main(String[] args) {
		
		/* Problema exemplo - IF / ELSE
		 * 
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana 
		 * (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o dia da semana correspondente, 
		 * conforme 	
		 * exemplos.
		 * 
		 * Entrada:                       Saída:
		 * 1                              Dia da semana: domingo
		 * 
		 * 4                              Dia da semana: quarta
		 * 
		 * 9                              Dia da semana: valor inválido
		 * 
		 */
		
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		if(x == 1) 
			dia = "Domingo";
		else if(x == 2) 
			dia = "Segunda-Feira";
		else if(x == 3) 
			dia = "Terça-Feira";
		else if(x == 4) 
			dia = "Quarta-Feira";
		else if(x == 5)  
			dia = "Quinta-Feira";
		else if(x == 6) 
			dia = "Sexta-Feira";
		else if (x == 7)  
			dia = "Sabádo";
		else 
			dia = "valor inválido";
		
		
		System.out.println("Dia da semana: " + dia);			
		
		
		sc.close();
	}

}
