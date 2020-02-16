package exercicioResolvido01;

import java.util.Locale;
import java.util.Scanner;

public class parte01 {

	public static void main(String[] args) {

		/* EXERCICIOS RESOLVIDO 01 - PARTE 01
		 * 
		 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
		 * segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final
		 * que o aluno obteve no ano juntamente com um texto explicativo. Caso a nota
		 * final do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO",
		 * conforme exemplos. Todos os valores devem ter uma casa decimal.
		 * 
		 * Exemplos:
		 * 
		 * Entrada:                   Saída:
		 * 45.5                       NOTA FINAL = 76.8
		 * 31.3
		 * 
		 * 34.0                       NOTA FINAL = 57.5
		 * 23.5                       REPROVADO
		 */
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);

		float nota1 = sc.nextFloat();
		float nota2 = sc.nextFloat();
		float resultado = (nota1 + nota2);
		
		System.out.printf("NOTA FINAL = %.1f%n", resultado);
		
		if (resultado < 60f)
			
			System.out.println("REPROVADO");
			
		sc.close();
		
	}

}
