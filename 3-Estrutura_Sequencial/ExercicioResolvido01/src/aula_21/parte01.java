package aula_21;

import java.util.Locale;
import java.util.Scanner;

public class parte01 {

	public static void main(String[] args) {

		/* EXERCICÍO 01 
		 * 
		 * Fazer um programa para ler as medidas da largura e comprimento
		 * de um terreno retangular com uma casa decimal, bem como o valor do metro
		 * quadrado do terreno com duas casas decimais. Em seguida, o programa deve
		 * mostrar o valor da área do terreno, bem como o valor do preço do terreno,
		 * ambos com duas casas decimais, conforme exemplo.
		 * 
		 * 
		 * Exemplo:
		 *  
		 * Entrada:         Saída:
		 * 10.0             ÁREA = 300.00
		 * 30.0             PREÇO = 60000.00
		 * 200.00
		 * 
		 * área = largura x comprimento
		 * preço = área x preço do metrô quadrado
		 */
		
		
		Locale.setDefault(Locale.US);

		
		Scanner verificador = new Scanner(System.in);

		System.out.println("Calcucule a área de um retângulo:");
		System.out.println("=================================");
		System.out.println("Informe um valor de medida para 'LARGURA':");
		float largura = verificador.nextFloat();
		System.out.println("Informe um valor de medida para 'COMPRIMENTO':");
		float comprimento = verificador.nextFloat();
		System.out.println("Informe o valor do metro quadrado do terreno:");
		float metroQuadrado = verificador.nextFloat();
		float area = largura * comprimento;
		float preco = area * metroQuadrado;
		System.out.println("================================");
		System.out.printf("Valor da área do terreno: %.2f%n", area);
		System.out.printf("Preço do terreno: %.2f", preco);

		verificador.close();

	}

}
