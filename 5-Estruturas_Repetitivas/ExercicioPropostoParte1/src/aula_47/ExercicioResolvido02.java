package aula_47;

import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler um número indeterminado de dados, contendo cada um, a 
		 * idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor 
		 * de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for 
		 * entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
		 * 
		 * Exemplos:
		 * 
		 * Entrada       Saída
		 * 31            34.67
		 * 27
		 * 46
		 * -5
		 * 
		 * Entrada       Saída
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