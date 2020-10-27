package aula_47;

import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um, a 
		 * idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m um valor 
		 * de idade negativa. Calcular e imprimir a idade m�dia deste grupo de indiv�duos. Se for 
		 * entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
		 * 
		 * Exemplos:
		 * 
		 * Entrada       Sa�da
		 * 31            34.67
		 * 27
		 * 46
		 * -5
		 * 
		 * Entrada       Sa�da
		 * -10           impossivel calcular
		 * 
		 */
		
		Scanner imprimir = new Scanner(System.in);
		
		double idadeMedia = 0;
		int contador = 0;
		
		int numero = imprimir.nextInt();
		
		while(numero >= 0) {			
			contador = contador + 1;
			idadeMedia = idadeMedia + numero;
			numero = imprimir.nextInt();
		}
			
		if(contador > 0) {
			idadeMedia = (double) (idadeMedia / contador);
			System.out.printf("%.2f%n",idadeMedia);	
		}else {
			System.out.println("impossivel calcular");
		}
		
		imprimir.close();
	}
}