package aula_18;

import java.util.Scanner;

public class parte02 {

	public static void main(String[] args) {
		
		//Como localizar posição de uma letra, em uma palavra.
		
		Scanner leitura1 = new Scanner(System.in);
		
		System.out.println("Digite uma palavra com 4 letras:");
		
		//O valor atribuido entre parênteses em '.charAt()' mostra posição da letra, da palavra informada.
		char palavra = leitura1.next().charAt(0);
		
		System.out.printf("A primeira letra da palavra é:%n"+ "'" + palavra + "'" + "%n");
		
		//Outro exemplo:
		System.out.println("Digite uma outra palavra com 4 letras:");
		
		char palavra1 = leitura1.next().charAt(2);
		
		System.out.printf("A terceira letra da palavra é:%n" + "'" + palavra1 + "'");

	}

}
