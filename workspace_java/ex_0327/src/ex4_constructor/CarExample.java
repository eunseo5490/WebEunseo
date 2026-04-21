package ex4_constructor;

public class CarExample {
	public static void main(String[] args) {
		
		//this()
		//현재 클래스에 선언되어 있는 생성자를 가리킬 수 있도록 하는 키워드이다.
		
		
		
		
		
		
		
		
		
		
		Car car1 = new Car(); //기본생성자를 호출
		
		Car car2 = new Car("자가용"); //모델만 초기화하는 생성자 실행
		
		Car car3 = new Car("자가용","빨강");
		
		Car car4 = new Car("택시","흰색",200);
	}

}
