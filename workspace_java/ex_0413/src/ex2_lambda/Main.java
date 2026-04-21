package ex2_lambda;

public class Main {
	public static void main(String[] args) {
		
		//1. 구현클래스를 만들어서 사용하
		MyFunction mi = new MyFunctionImpl();
		mi.run();
		
		//2. 익명 클래스 만들기
		MyFunction m = new MyFunction() {
			@Override
			public void run() {
				System.out.println("익명클래스");
			}
		};
		m.run();
		
		//3. 람다식 사용하기
		MyFunction m2 = () -> {System.out.println("람다식");};
		m2.run();
		
		//람다식을 사용하는 이유
		//1. 코드가 짧아진다. <- 익명 클래스보다 코드를 짧게 작성할 수 있다.
		//2. 핵심 로직이 잘 보인다. <- 껍데기를 줄이고 의도한 동작만 보이게 할 수 있다.
		//3. 컬렉션 처리에 유용하다. <- 정렬, 필터링, 반복 처리와 같은 작업에서 자주 사용된다.
		//4. 함수형 프로그래밍 스타일을 일부 사용할 수 있다.
		
		//매개변수가 한 개인 람다식
		
		//람다식은 기본적으로 변수에 담을 수 있다.
		//타입이 인터페이스여야 한다.
		
		PrintNum pn = num -> {System.out.println(num);};
		pn.print(5);
		
		Add add = (a, b) -> a + b;
		System.out.println(add.sum(1, 2));
		
		
		NumberCheck nc = num -> {if(num%2 ==0 && num >0) {return true;}
		return false;};
		
		System.out.println(nc.test(3));
		
	}
}
