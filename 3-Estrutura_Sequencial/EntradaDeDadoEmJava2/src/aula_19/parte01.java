package aula_19;

import java.util.Scanner;

public class parte01 {

	public static void main(String[] args) {
		
		Scanner leituraDeDados = new Scanner(System.in);
		
		System.out.println("Digite um nome, idade, sexo:");
		
		String s1, s2, s3;
		
		s1 = leituraDeDados.next();
		s2 = leituraDeDados.next();
		s3 = leituraDeDados.next();
		
		System.out.println("Dados digitados:");
		
		System.out.printf(s1 + "%n" + s2 + "%n" + s3);
		
	}

}
