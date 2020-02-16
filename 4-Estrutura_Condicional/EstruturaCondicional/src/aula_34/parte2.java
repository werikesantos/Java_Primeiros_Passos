package aula_34;

import java.util.Scanner;

public class parte2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//EXEMPLO DE ESTRUTURA CONDICIONAL "COMPOSTA"
		
		System.out.println("Que horas são?");
		int horas = sc.nextInt();
		
		if (horas < 12) {
			
			System.out.println("Bom dia!");
			
		}else{
			
			System.out.println("Boa tarde!");
			
		}
		
		sc.close();
	}

}