package aula_34;

import java.util.Scanner;

public class parte1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//EXEMPLO DE ESTRUTURA CONDICIONAL SIMPLES
		
		System.out.println("Que horas são?");
		int horas = sc.nextInt();
		
		if (horas < 12) {
			
			System.out.println("Bom dia!");
			
		}
		
		sc.close();
	}

}
