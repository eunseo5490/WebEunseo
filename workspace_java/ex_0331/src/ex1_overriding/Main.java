package ex1_overriding;

public class Main {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Computer c2 = new Computer();
		
		System.out.println(c1.areaCircle(5));
		System.out.println(c2.areaCircle(10));
		
		//오버라이딩의 경우 상속관계에서만 사용할 수 있다.
		
	}
}
