package aula_39;

import java.util.Locale;
import java.util.Scanner;

public class parte2 {

	public static void main(String[] args) {
		
		/* Problema exemplo - SWITCH CASE
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
		 * 
		 */

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String day;
		
		switch(x){ //Interruptor
		case 1:
			day = "Sunday"; //Domingo
			break;
		case 2:
			day = "Monday"; //Segunda - Feira
			break;
		case 3:
			day = "Tuesday"; //Terça - Feira
			break;
		case 4:
			day = "Wednesday"; //Quarta - Feira
			break;
		case 5:
			day = "Thursday"; //Quinta - Feira
			break;
		case 6:
			day = "Friday"; //Sexta - Feira
			break;
		case 7:
			day = "Saturday"; //Sábado
			break;
		default: //PADRÃO
			day = "Invalid value"; //Valor Inválido
			break;
		}
		
			System.out.println("Day of the week: " + day);

			
		sc.close();
		
	}
		
}


