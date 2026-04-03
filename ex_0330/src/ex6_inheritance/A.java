package ex6_inheritance;

public class A {
	
	void hello() {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		D d = new D();
		
	}

}

class B extends A {
	void hello() {
		System.out.println("B");
	}
}

class C extends A {
	void hello() {
		System.out.println("C");
	}
}

class D extends B {
	
}

