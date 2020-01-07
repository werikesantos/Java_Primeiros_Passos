package entradaDeDados;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		//A linha (10) é utilizada para monitorar, os dados informados pelos dispositivos de entrada.
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite abaixo, a informação que deseja registrar no sistema:");
		
		// A linha (15) realiza a leitura do dado, e guarda em uma variavel.
		String x = leitura.nextLine();
		
		System.out.printf("Os dados informados acima, foram registrados com sucesso! %n"+ "'"+ x +"'%n");	
		
		// A linha (20) finaliza execução da variavel de monitoramento de dados, declarado na linha(10).
		leitura.close();	
		
		/*ATENÇÃO:
		 Tipos de declarações, de leitores de dados:
		 
		 nextLine(); => Leitura de FRASES.
		 next(); => Leitura de PALAVRAS.
		 nextInt(); => Leitura de NÚMEROS INTEIROS.
		 nextDouble(); => Leitura de NÚMERO COM PONTO FLUTUANTE.
		  
		 	//OBS: A CONDIÇÃO DA LINHA(28), UTILIZARÁ A ',/.' CONFORME A CONFIGURAÇÃO DO PC.
		 	 	SE A CONFIGURAÇÃO FOR EM PORTUGUÊS, O SINAL SERÁ UMA VÍRGULA ','.
		 	 	SENDO ASSIM, PARA UTILIZAR O PADRÃO AMERICANO, CONFICULAR O 'Locale'. 
		 	 	VEJA O EXEMPLO ABAIXO NA LINHA (35):
		 		
		 		Locale.setDefalt(Locale.US);		
		*/
	}

}
