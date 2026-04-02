package ex1_innerclass.staticclass;

public class Main {
	public static void main(String[] args) {
		
		
		//정적 내부클래스의 객체 생성 방법
		Outer.Inner inner = new Outer.Inner();
		
		User user = new User.Builder()
				.id("eunseo")
				.password("1234")
				.name("박은서")
				.age("20")
				.build();
	}
}
