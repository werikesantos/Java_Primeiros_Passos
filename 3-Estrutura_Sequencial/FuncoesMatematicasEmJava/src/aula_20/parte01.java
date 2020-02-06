package aula_20;

public class parte01 {

	public static void main(String[] args) {

		// 1) SEGUE EXEMPLO DE COMO ENCONTRAR O VALOR DE RAÍZ QUADRADA.
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);

		// NESTE EXEMLO MOSTRA, QUE PODE COLOCAR O VALOR DIRETAMENTE, AO INVÉS DE
		// COLOCAR DENTRO DE VARIÁVEL.
		C = Math.sqrt(25.0);

		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);

		// 2) COMO LOCALIZAR O VALOR DA POTÊNCIA
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		// 3) COMO LOCALIZAR O VALOR ABSOLUTO
		A = Math.abs(y);
		B = Math.abs(z);

		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
	}

}
