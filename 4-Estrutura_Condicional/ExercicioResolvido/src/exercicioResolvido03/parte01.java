package exercicioResolvido03;

import java.util.Locale;
import java.util.Scanner;

public class parte01 {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
		 * menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez.
		 * 
		 * Exemplos:
		 * 
		 * Entrada:                  Saída:
		 * 7 3 8                     MENOR = 3
		 * 
		 * 5 12 5                    MENOR = 5
		 * 
		 * 9 9 9                     MENOR = 9
		 */

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, menor;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		//qual o menor dentre os três?
		if(A < B && A < C ) { 
			
			System.out.println("Menor = " + A);
			
		}
		else if(B < C && B < A){
			
			System.out.println("Menor = " + B);
			
		}
		else{

			System.out.println("Menor = " + C);			
		
		}
		
		sc.close();
	}

}
