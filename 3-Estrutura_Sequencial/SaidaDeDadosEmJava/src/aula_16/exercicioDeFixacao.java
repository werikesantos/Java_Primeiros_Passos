package aula_16;

import java.util.Locale;

public class exercicioDeFixacao {

	public static void main(String[] args) {
		
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
		
		//Linha (29) formata os números, para o padrão Americano.
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal U.S.A:%n -%.3f", medida);

	}

}
