package aula_18;

import java.util.Locale;
import java.util.Scanner;

public class parte05 {

	public static void main(String[] args) {
		
		//COMO REALIZAR A LEITURA DE VARIOS DADOS
		
		
		//LINHA (11) MOSTRA COMO TROCAR O SEPARADOR DECIMAL ',' PARA '.' 
		Locale.setDefault(Locale.US);
		
		Scanner leituraDeDados = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		System.out.println("Digite seu nome, idade e altura(Ex: 1.80):");
		
		x = leituraDeDados.next();
		y = leituraDeDados.nextInt();
		z = leituraDeDados.nextDouble();
		
		System.out.printf("Dados digitados: " + "%n" + x + "%n" + y + "%n" + z);

	}

}
