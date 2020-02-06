package aula_20;

public class parte02 {

	public static void main(String[] args) {
			
		//INCLUINDO FUNÇÕES EM EPRESSÕES MAIORES
		
		int a = 5;
		int b = 3;
		int c = 2;
		
		double delta = Math.pow(b, 2.0) - 4*a*c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println(x2);

	}

}
