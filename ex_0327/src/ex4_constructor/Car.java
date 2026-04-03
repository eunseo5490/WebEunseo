package ex4_constructor;

public class Car {
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자
	//반환타입이 없다.
	//생성자의 이름은 반드시 클래스명이어야 한다.
	public Car() {
		
	}
	
	//모델만 초기화하는 생성자
	public Car(String model) {
		this.model = model;
	}
	
	//모델과 색상을 초기화하는 생성자
	public Car(String model, String color) {
		this(model);
		this.color = color;
	}
	
	//모델, 색상, 최고속도를 초기화하는 생성자
	public Car(String model, String color, int maxSpeed) {
		this(model, color);
		this.maxSpeed = maxSpeed;
		
	}

}
