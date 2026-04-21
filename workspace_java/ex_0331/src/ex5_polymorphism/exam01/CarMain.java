package ex5_polymorphism.exam01;

public class CarMain {
	public static void main(String[] args) {
		//자동차 객체 만들기
		Car car = new Car();
		
		car.tire = new Tire();
		
		car.run();
		
		//한국타이어로 타이어 교체
		car.tire = new HankkokTire();
		car.run();
		
		car.tire = new KumhoTire();
		car.run();
		
	}
}
