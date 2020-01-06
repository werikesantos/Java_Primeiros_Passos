package processamentoDeDados;

public class Atividade01 {

	public static void main(String[] args) {
		
		int x, y, w;
		float z;
		
		//Exemplo 1
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		//Exemplo 2
		w = 5;
		z = 2 * w;
		
		System.out.println(w);
		System.out.println(z);
		
		//=========================//
		//EXERCICIO 1 
		
		//CALCULE a ÁREA de um TRAPÉZIO, cujo a medida da BASE MENOR é 6, a BASE MAIOR é 8, e sua ALTURA é igual a 5.
		
		//FORMULA
		// area = ((b+B)/2)*h
			
		float b = 6;
		float B = 8;
		float h = 5;
		
		float area = ((b+B) / 2) * h;
		
		System.out.printf("A área do trapézio é igual:" + area+"%n");
		//=========================//
		
		//Exemplo 3
		int c = 5;
		int d = 2;
		
		/* ATENÇÃO:

			Seguindo a linha (50), o resultado será 2.0 pois o compilador entende que são números inteiros, 
			 	conforme especificados nas linhas (42), (43). Com isso, o resultado também será um número inteiro.
			 
			 float resultado = c / d;
			 
			 Para resolver isso, basta colocar na frente da operação o tipo (float), e o resultado correto será mantido.
		 
		*/
		
		float resultado = (float) c / d;
		
		System.out.println("O Resultado da Divisão é igual: " + resultado);
		
		//Exemplo 4 (CASTING - CONVERSÃO DE TIPOS)
		
		/*ATENÇÃO:
			Seguindo o exemplo da linha (66), o programa apresentará um erro, pois o tipo da variável (e), foi declarado como 
				um tipo 'float'. Conforme demonstrado na linha (74).
			
				byte f = e;
			
				Com isso, será necessário CONVERTER A VARIÁVEL (e) DO TIPO 'float' PARA UM TIPO INTEIRO 'byte'.
				
				Para resolver, basta colocar o tipo 'byte' dentro de parênteses, como é mostrado na linha (75).				
				
		*/
		
		float e = 5.0f;
		byte f = (byte) e;
		
		System.out.print(f);
	}

}
