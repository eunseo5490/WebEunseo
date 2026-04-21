package ex2_interface;

public class ExtendsMain {
	public static void main(String[] args) {
		interfaceImpl impl = new interfaceImpl();
		//인터페이스의 타입 변환
		//인터페이스와 구현클래스 사이에서 발생
		
		//자동타입변환
		//구현 객체를 인터페이스 타입변수에 대입할 때
		
		//강제타입변환
		InterfaceeA ia = impl;
		ia.methodA();
		//ia.methodB();
		//ia.methodC();
		
		System.out.println();
		
		InterfaceB ib = impl;
		//ib.methodA();
		ib.methodB();
		//ib.methodC();
		
		System.out.println();
		
		//다른 인터페이스를 상속 받았기 때문에 세 개의 메서드 전부 가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}
}
