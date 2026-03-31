package ex7_examples;

class Calculator {
	
	public int getResult(int n1, int n2) {
		return -1;
	}
}

class CalPlus extends Calculator {
	@Override
	public int getResult(int n1, int n2) {
		return n1+n2;
	}
}

class CalMinus extends Calculator {
	@Override
	public int getResult(int n1, int n2) {
		return n1-n2;
	}
}

public class Main {
	public static void main(String[] args) {
		CalPlus plus = new CalPlus();
		CalMinus minus = new CalMinus();
		
		System.out.println("CalPlus : "+(plus.getResult(10, 20)));
		System.out.println("CalMinus : "+(minus.getResult(20, 5)));
	}
}
