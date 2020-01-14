package exercicio_resolvido;

import java.util.Scanner;

public class parte01 {
	
	public static void main(String []args) {
		
		/* EXERCICÍO 01
			Fazer um programa para ler as medidas da largura e comprimento de um terreno
			retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
			com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
			terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
			conforme exemplo.
			
			Exemplo:
			Entrada:                       Saída:
				10.0                          AREA = 300.00
				30.0                          PRECO = 60000.00
				200.00
			
			|  
			|  = 30.0 metros                área = largura x comprimento
			                                preço = área x preço do metro quadrado
			__ = 10.0 metros
			
		*/
		
		Scanner verificador = new Scanner (System.in);
		
		System.out.println("Calucule a área de um retangulo:");
		System.out.println("================================");
		System.out.println("Informe um valor de medida para 'LARGURA':");
		float largura = verificador.nextFloat();
		System.out.println("Informe um valor de medida para 'COMPRIMENTO':");
		float comprimento = verificador.nextFloat();
		float area = largura * comprimento;
		System.out.printf("A largura de %.1fm² multiplicado pelo comprimento de %.1fm², é igual a área total de %.1fm².", largura, comprimento, area);
		System.out.println("================================");
	}
}
