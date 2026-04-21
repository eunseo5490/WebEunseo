package ex3_access.method.package1;

//같은 패키지의 다른 클래스
public class B {
	//메서드를 호출하기 전까지는 실행이 안됨
	public void method() {
		
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 2;
		//a.field3 = 3; private이라서 안된다.
		
		a.method1();
		a.method2();
		//a.method3(); private
	}
	
	
	
	

}
