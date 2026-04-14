package ex1_lambda;

public class Main {
	public static void main(String[] args) {
		
		CalculatorService cs = new CalculatorService();
		
		Calculator c = (a,b) -> a+b;
		
		cs.execute(c);
		cs.execute((a,b) -> a-b);
		
		
		//람다식 반환받아 사용
		Calculator add = cs.getCalculator("add");
		System.out.println(add.calc(1, 3));
		
		Calculator sub = cs.getCalculator("sub");
		System.out.println(sub.calc(1, 3));
		
	}
}
