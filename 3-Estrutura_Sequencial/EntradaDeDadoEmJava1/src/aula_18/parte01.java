package aula_18;

import java.util.Scanner;

public class parte01 {

	public static void main(String[] args) {
		
		/*ATENÇÃO:
			Tipos de declarações, de leitores de dados:
			 
			nextLine(); => Leitura de FRASES.
			next(); => Leitura de PALAVRAS.
			nextInt(); => Leitura de NÚMEROS INTEIROS.
			nextDouble(); => Leitura de NÚMERO COM PONTO FLUTUANTE.		
		*/	
		
		//CRIANDO UM OBJETO	CHAMADO DE 'leituraDeDados'		
		Scanner leituraDeDados = new Scanner(System.in);
			
			//CRIANDO UMA VARIÁVEL. LINHA(22)
			String x;
			
			System.out.println("Digite: ");
			
			//REALIZA A LEITURA DO DADO DIGITADO PELO USUÁRIO. LINHA(27)
			x = leituraDeDados.next();
			
			//MOSTRANDO O CONTEÚDO DA VARIÁVEL 'x'. LINHA(30)
			System.out.println("Você digitou: " + x);
		
		//FECHANDO
		leituraDeDados.close();
		
	}

}
