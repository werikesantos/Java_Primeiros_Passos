package entradaDeDadosParte2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Utilize os 3 campos abaixo, para registrar o seu nome completo, da sua mãe e do seu pai, respectivamente:");
		String nome = dados.nextLine();
		String mae = dados.nextLine();
		String pai = dados.nextLine();
		
		System.out.println("Dados Registrados com sucesso!");
		
		System.out.println("O seu nome é: " + "'" +nome + "'"  );
		System.out.println("O nome da sua mãe é: " + "'" +mae + "'"  );
		System.out.println("O nome do seu pai é: " + "'" +pai + "'"  );
		
		System.out.printf("Muito obrigado, pelas informações!!!%nAté mais ;)");
		
		dados.close();
	}

}
