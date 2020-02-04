package aula_18;

import java.util.Scanner;

public class parte02 {

	public static void main(String[] args) {

		Scanner leituraDeDados = new Scanner(System.in);

		System.out.println("Digite um valor:");

		// LENDO UM NÚMERO INTEIRO. LINHA(14)
		byte n1 = leituraDeDados.nextByte();

		System.out.println("Número digitado: " + n1);

		leituraDeDados.close();
	}

}
