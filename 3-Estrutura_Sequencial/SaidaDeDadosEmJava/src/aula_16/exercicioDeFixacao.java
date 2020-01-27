package aula_16;

import java.util.Locale;

public class exercicioDeFixacao {

	public static void main(String[] args) {
		
		/*EXERCICIO DE FIXAÇÃO:
			Em um novo programa, inicie as seguintes variáveis:
			
			String product1 = "Computer";
			String product2 = "Office desk";
			
			int age = 30;
			int code = 5290;
			char gender = 'F';
			
			double price1 = 2100.0;
			double price2 = 650.50;
			double measure = 53.234567;
			
			Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:
			
			Products:
			Computer, which price is $ 2100,00
			Office desk, which price is $ 650,50
			
			Record: 30 years old, code 5290 and gender: F
			
			Measue with eight decimal places: 53,23456700
			Rouded (three decimal places): 53,235
			US decimal point: 53.235
		*/
	
		
		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		
		byte idade = 30; //byte-> 8 bits (-128 a 127)
		short codigo = 5290; //short-> 16 bits (-32768 a 32767)
		char sexo = 'F'; //char-> 16 bits
		
		float preco1 = 2100.0f; //float-> 32 bits (-1,4024E-37 a 3,4028E+38)
		float preco2 = 650.50f;
		float medida = 53.234567f;
		
		System.out.printf("Produtos:%n -%s custa: R$ %.2f. %n -%s custa: R$ %.2f. %n", produto1, preco1, produto2, preco2);
		
		System.out.printf("Registros:%n -%d anos%n -Código: %d%n -Gênero: '%s'%n", idade,codigo,sexo);
		
		System.out.printf("Medida com 8 casas decimais:%n -%.8f%n",medida);
		
		System.out.printf("Três casas decimais:%n -%.3f%n", medida);
		
		//Linha (57) formata os números, para o padrão Americano.
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal U.S.A:%n -%.3f", medida);

	}

}
