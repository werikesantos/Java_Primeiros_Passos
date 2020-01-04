package teste;

import java.util.Scanner;

public class Teste{
		
		public static void main(String []args) {
			
			Scanner resultado = new Scanner (System.in);
			
			double x, y, media;
			
			System.out.println("Digite um número:");
			x = resultado.nextDouble();
			
			System.out.println("Digite outro número:");
			y = resultado.nextDouble();
			
			media = (x + y) / 2;
			
			System.out.println("A média é = " + media);
			
			resultado.close();
			
		}
		
}

	
