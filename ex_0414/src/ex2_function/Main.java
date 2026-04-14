package ex2_function;

import java.util.function.Consumer;

//메서드를 만들 때 발생하는 다양한 경우의 수를
//인터페이스로 만들어 놓은 것

public class Main {
	public static void main(String[] args) {
		//Cosumer<T>
		//값을 하나 받아서 소비만 하는 인터페이스
		//즉, 입력은 있지만 반환값은 없다
		//void accept(T t);
		
		Consumer<String> con = str -> System.out.println("출력 : "+str);
		con
		.accept("아녕하세요");
		con.accept("자바");
	}
}
