package aula_19;

import java.util.Scanner;

public class parte02 {

	public static void main(String[] args) {

		/* QUEBRA DE LINHA PENDENTE:
		 * Quando você usa um comando de leitura diferente do
		 * nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente"
		 * na entrada padrão.
		 */

		Scanner leituraDeDados = new Scanner(System.in);

		System.out.println("Digite seu ano de nascimento, nome, idade, sexo:");
		
		int x;
		String s1, s2, s3;
		
		x = leituraDeDados.nextInt();
		leituraDeDados.next();
		s1 = leituraDeDados.nextLine();
		s2 = leituraDeDados.nextLine();
		s3 = leituraDeDados.nextLine();
		
		System.out.println("Dados digitados:");

		System.out.printf(x + "%n" + s1 + "%n" + s2 + "%n" + s3);

	}

}
