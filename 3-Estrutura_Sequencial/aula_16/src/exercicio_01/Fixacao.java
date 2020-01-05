package exercicio_01;

import java.util.Locale;

public class Fixacao {
	
	public static void main (String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		
		int idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.printf("Produtos:%n -%s custa: R$ %.2f. %n -%s custa: R$ %.2f. %n", produto1, preco1, produto2, preco2);
		
		System.out.printf("Registros:%n -%d anos%n -Código: %d%n -Gênero: '%s'%n", idade,codigo,sexo);
		
		System.out.printf("Medida com 8 casas decimais:%n -%.8f%n",medida);
		
		System.out.printf("Três casas decimais:%n -%.3f%n", medida);
		
		//Linha (29) formata os números, para o padrão Americano.
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal U.S.A:%n -%.3f", medida);
		
	}
}
