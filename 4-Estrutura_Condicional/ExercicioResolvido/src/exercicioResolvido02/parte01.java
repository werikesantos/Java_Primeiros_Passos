package exercicioResolvido02;

import java.util.Locale;
import java.util.Scanner;

public class parte01 {

	public static void main(String[] args) {
		
		/* Exercício resolvido 02 - URI 1036 - Fórmula de Bhaskara
		 * 
		 * LINK DA AULA DE FORMULA DE 2º GRAU + BASKARA + DELTA
		 * https://www.youtube.com/watch?v=-kCOHO_pNxs&t=32s
		 * 
		 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível 
		 * calcular as 
		 * raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de 
		 * numero negativo.
		 * 
		 * Entrada
		 * 
		 * Leia três valores de ponto flutuante (double) A, B e C.
		 * 
		 * Saída
		 * 
		 * Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso 
		 * contrário, imprima o 
		 * resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
		 * Imprima sempre 
		 * o final de linha após cada mensagem.
		 * 
		 * Exemplos de Entrada:	                            Exemplos de Saída:
		 * 10.0 20.1 5.1                                    R1 = -0.29788
		 *                                                  R2 = -1.71212
		 * 
		 * 0.0 20.0 5.0                                     Impossivel calcular
		 * 
		 * 10.3 203.0 5.0                                   R1 = -0.02466
		 *                                                  R2 = -19.68408
		 *     
		 * 10.0 3.0 5.0                                     Impossivel calcular 
		 *    
		 *                                                      
		 * Análise:
		 * ax 2 + bx + c = 0
		 * 
		 * • Delta não pode ser negativo
		 * • A não pode ser zero
		 */
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, delta,x1, x2;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		delta = (Math.pow(B, 2) - 4 * A * C);
		
		if (delta > 0 && A > 0) {
			x1 = ((-B + Math.sqrt(delta)) / (2 * A));
			x2 = ((-B - Math.sqrt(delta)) / (2 * A));
			System.out.printf("R1 = %.5f%nR2 = %.5f%n",x1, x2);
		}else 
			System.out.println("Impossivel calcular");
		
		sc.close();
	}

}
