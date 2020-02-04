package aula_18;

import java.util.Locale;
import java.util.Scanner;

public class parte03 {

	public static void main(String[] args) {

		//LINHA (11) MOSTRA COMO TROCAR O SEPARADOR DECIMAL ',' PARA '.' 
		Locale.setDefault(Locale.US);
		
		//CRIANDO UM OBJETO CHAMADO 'leituraDeDados'
		Scanner leituraDeDados = new Scanner(System.in);

		System.out.println("Digite um valor:");

		// LENDO UM NÚMERO INTEIRO. LINHA(19)
		double n1 = leituraDeDados.nextDouble();
		
		//FORMATANDO A QUANTIDADE DE NÚMEROS APÓS A VÍRGULA.
		System.out.printf("Número digitado: %.2f", n1);

		leituraDeDados.close();

	}

}
