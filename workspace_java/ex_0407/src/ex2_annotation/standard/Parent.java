package ex2_annotation.standard;

public class Parent {
	public void method() {};
}

class Child extends Parent {
	
	@Override //부모 클래스의 메서드를 재정의한다.
	public void method() {
		super.method();
	}
}