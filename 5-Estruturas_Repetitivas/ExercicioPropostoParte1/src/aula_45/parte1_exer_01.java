package aula_45;

public class parte1_exer_01 {

	private int x, y, i;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {

		parte1_exer_01 ativdade01 = new parte1_exer_01();
		
		ativdade01.Atividade01();
		ativdade01.Atividade02();
		ativdade01.Atividade03();
		ativdade01.Atividade04();
		ativdade01.Atividade05();
		ativdade01.Atividade06();

	}
	
	public void Atividade01() {
		
		parte1_exer_01 ativdade01 = new parte1_exer_01();
		
		int x = ativdade01.getX();
		int y = ativdade01.getY();
		int i = ativdade01.getI();
		
		x = 5;
		y = 0;
		
		while(x > 2) {
			System.out.println(x);
			y = y + x;
			x = x - 1;
		}
		System.out.println("\n");
	}

	public void Atividade02() {
			
		parte1_exer_01 ativdade01 = new parte1_exer_01();
			
		int x = ativdade01.getX();
		int y = ativdade01.getY();
		int i = ativdade01.getI();
			
		x = 2;
		y = 0;
			
		while(x < 60) {
			System.out.println(x);
			x = x * 2;
			y = y + 10;
		}
		System.out.println("\n");		
	}
	
	public void Atividade03() {
		
		parte1_exer_01 ativdade01 = new parte1_exer_01();
			
		int x = ativdade01.getX();
		int y = ativdade01.getY();
		int i = ativdade01.getI();
			
		x = 100;
		y = 100;
			
		while(x != y) {
			System.out.println("olha");
			x = (int) Math.sqrt(y);
		}
		System.out.println("\n");
	}
	
	public void Atividade04() {
		
		parte1_exer_01 ativdade01 = new parte1_exer_01();
			
		int x = ativdade01.getX();
		int y = ativdade01.getY();
		int i = ativdade01.getI();
			
		x = 0;
		y = 0;
			
		while(x < 5) {
			y = x * 3;
			System.out.println(y);
			x = x + 1;
		}
		System.out.println("\n");		
	}
	
	public void Atividade05() {
		
		parte1_exer_01 ativdade01 = new parte1_exer_01();
			
		int x = ativdade01.getX();
		int y = ativdade01.getY();
		int i = ativdade01.getI();
			
		x = 2;
		y = 10;
		
		System.out.println("Olá");
		
		while(x < y) {
			System.out.println(x + "-" + y);
			x = x * 2;
			y = y + 1;			
		}
		System.out.println("\n");
	}
	
	public void Atividade06() {
		
		parte1_exer_01 ativdade01 = new parte1_exer_01();
			
		int x = ativdade01.getX();
		int y = ativdade01.getY();
		int i = ativdade01.getI();
			
		x = 4;
		y = 0;
		i = 0;
		
		while(i < x) {
			i = i + 1;
			y = y + i;
			System.out.println(i);
			System.out.println(y);
		}
	}
}
