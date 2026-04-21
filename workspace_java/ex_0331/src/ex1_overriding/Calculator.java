package ex1_overriding;

public class Calculator {
	
	//반지름을 외부에서 받아 원의 넒이를 반환하는 areaCircle 메서드
	public double areaCircle(double r) {
		System.out.println("Calculator areaCircle() 실행");
		return r*r*3.14;
	}

}
