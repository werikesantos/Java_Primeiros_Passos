package aula_25;

import java.util.Locale;
import java.util.Scanner;

public class parte01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		/* Exercício 2 - Calcule a área, perímetro e diagonal de um retângulo.
		 * 
		 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em
		 * seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com
		 * quatro casas decimais, conforme exemplo.
		 * 
		 * Exemplo:
		 * 
		 * Entrada:                        Saída:
		 * 5.0                             AREA = 20.0000
		 * 4.0                             PERIMETRO = 18.0000
		 *                                 DIAGONAL = 6.4031
		 * 
		 * Fórmula:
		 * Área = base x altura
		 * Perímetro = 2 x base + 2 x altura
		 * Diagonal = √base² + altura²
		 */
		
		Scanner sc = new Scanner(System.in);
		
		float base = sc.nextFloat();
		float altura = sc.nextFloat();
		
		float area = (base * altura);
		float perimetro = ((2 * base) + (2 * altura));
		double diagonal = Math.sqrt((Math.pow(base, 2.0) + (Math.pow(altura, 2.0))));
		
		
		System.out.printf("Área = %.4f%nPERIMETRO = %.4f%nDIAGONAL = %.4f%n",area, perimetro, diagonal);
		
		sc.close();
	}

}
