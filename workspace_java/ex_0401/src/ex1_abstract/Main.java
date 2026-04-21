package ex1_abstract;

public class Main {
	public static void main(String[] args) {
		
		//추상클래스의 객체는 직접 만들 수 없다.
		//Animal a = new Animal(); //안됨
		
		Tiger t = new Tiger();
		t.name = "호랑이";
		t.eat();
		t.sound();
		
		Lion l = new Lion();
		l.name = "사자";
		l.eat();
		l.sound();
		
		
	}
}
