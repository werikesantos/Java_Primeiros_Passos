package aula_18;

import java.util.Locale;
import java.util.Scanner;

public class parte04 {

	public static void main(String[] args) {

		//COMO REALIZAR A LEITURA DE UM CARACTERE.

		// CRIANDO UM OBJETO CHAMADO 'leituraDeDados'
		Scanner leituraDeDados = new Scanner(System.in);

		System.out.println("Digite uma palavra:");

		// LENDO UM CARACTERE E SELECIONANDO A POSIÇÃO. '.charAt(0)' LINHA(18)
		char n1 = leituraDeDados.next().charAt(0);

		// IMPRIMINDO A PRIMEIRA LETRA DA PALAVRA
		System.out.printf("A primeira letra da palavra é: '" + n1 + "'%n");

		
		//OUTRO EXEMPLO:
		
		System.out.println("Digite uma outra palavra:");

		char palavra1 = leituraDeDados.next().charAt(2);

		System.out.printf("A terceira letra da palavra é:%n" + "'" + palavra1 + "'");

		//FECHANDO
		leituraDeDados.close();

	}

}
