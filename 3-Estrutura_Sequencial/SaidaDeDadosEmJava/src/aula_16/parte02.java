package aula_16;

import java.util.Locale;

public class parte02 {

	public static void main(String[] args) {
		
		/*MOSTRANDO O VALOR DE UMA VARIAVEL DECLARADA.
		 	Veja o exemplo na linha (14) de como guardar um valor(32) dentro de uma variavel(y).
		 		Na linha (16) esta mostrando como imprimir o valor da variavel (y) declarada na linha (14).
		*/
		
		int y = 32;
		
		System.out.println(y);
		
		
		/*PONTO FLUTUANTE.
			Veja na linha(23) como declarar a variavel(x), colocando números com ponto flutuante.
		*/
		
		double x = 10.35784;
		
		System.out.println(x);
		
		
		/*CONTROLE DE CASAS DECIMAIS.
			Veja na linha(36) que é necessario que coloque a letra (f => abreviação de formatado) na frente do (print).
				Logo após, coloque (%.2f => o número 2 indica quantas casas decimais você deseja imprimir no dispositivo de saida).
					(%n => realiza a quebra de linha).
		*/
		
		double z = 10.35784;
		
		System.out.printf("%.2f %n", z);
		
		System.out.printf("%.4f %n", z);
		
		
		/*CONFIGURANDO O SEPARADOR (,) PARA PADRÃO AMERICADO (.) 
			Veja na linha(46) o comando necessario para configurar o separador.
				Incluindo a linha(46), deve colocar a importação da linha(3) para que funcione.
		 */
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f %n", z);
		
		System.out.printf("%.4f %n", z);
		
		
		/*CONCATENAÇÃO
			Veja na linha(58) um exemplo de concatenação (+).
			
		 */
		
		System.out.printf("RESULTADO = " + x + " METROS.%n");
		
		
		/*CONCATENAÇÃO FORMATADA
			Veja na linha(71)
			formatação para String (%s)
			formatação para int (%d)
			formatação para double (%.2f)
		*/
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		
	}

}
