package aula_38;

import java.util.Locale;
import java.util.Scanner;

public class parte2 {

	public static void main(String[] args) {
		
		/* Operadores de atribuição cumulativa
		 * 
		 * a += b;        a = a + b;
		 * a -= b;        a = a - b;
		 * a *= b;        a = a * b;
		 * a /= b;        a = a / b;
		 * a %= b;        a = a % b;
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			
			// ( conta += ) É A MESMA COISA QUE ( conta = conta )
			
			conta += (minutos - 100) * 2.0;
			
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}

}