package aula_38;

import java.util.Locale;
import java.util.Scanner;

public class parte1 {

	public static void main(String[] args) {

		/* Problema exemplo: 
		 * 
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. 
		 * Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
		 * quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
		 * 
		 * Entrada:                        Saída:
		 * 22                              Valor a pagar: R$ 50.00
		 * 
		 * Entrada:                        Saída: 
		 * 103                             Valor a pagar: R$ 56.00
		 */
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		float minutos = sc.nextInt();
		
		if (minutos <= 100) 
			
			System.out.println("Valor a pagar: R$ 50.00");
		
		else {
			
			minutos = (((minutos - 100) * 2) + 50);
			System.out.printf("Valor a pagar: R$ %.2f%n", minutos);
			
		}
		
		sc.close();
		
	}

}
