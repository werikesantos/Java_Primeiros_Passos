package aula_34;

import java.util.Scanner;

public class parte3 {

	public static void main(String[] args) {
		
		//EXEMPLO DE "ENCADEAMENTO DE ESTRUTURA CONDICIONAL"
		
		//OBS: SE FOR COLOCAR APENAS "UMA LINHA DE CÓDIGO, NÃO PRECISA UTILIZAR OS {}".
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Que horas são?");
		int horas = sc.nextInt();
		
		if(horas < 12)
			
			System.out.println("Bom dia!");
			
		else if(horas >= 12 && horas < 18)
				
			System.out.println("Boa tarde!");
				
		else 
				
			System.out.println("Boa noite!");
			
		
		sc.close();
		
	}

}
