package package1;

import pack3.C;
import package2.B;

public class A {
	public void method() {
		System.out.println("A-method 실행");
		
		B b = new B();
		b.method();
	}
	
	public C getC() {
		C c = new C();
		return c;
	}
}
