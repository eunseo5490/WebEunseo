package ex2_function;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

//람다식의 합성 : 여러 함수를 하나의 함수처럼 연결해서 새로운 함수를 만드는 것
//람다식의 결합 : 함수 실행을 순서대로 이어서 실행

public class FunctioniExample {
	public static void main(String[] args) {
		//java에서는 다음 인터페이스에서 합성을 지원한다.
		//Functioni<T,R>
		//Predicate<T>
		//Consumer<T>
		
		//현재 함수를 실행 -> 다음함수를 실행한다.
		
		Function<Integer, Integer> multiply = x -> x *2;
		Function<Integer, Integer> add = x -> x +3;
		
		Function<Integer, Integer> result = multiply.andThen(add);
		
		System.out.println(result.apply(5)); //13
		
		//5 -> multiply -> 10 -> add -> 13
		
		//compose()
		//괄호 안의 함수를 실행 -> 앞에있는 함수를 실행
		result = multiply.compose(add);
		System.out.println(result.apply(5)); //16
		
		
		//Predicate의 결함(조건 합치기)
		Predicate<Integer> isPositive = x -> x>0;
		Predicate<Integer> isEven = x -> x%2 == 0;
		
		//and()
		Predicate<Integer> result2 = isPositive.and(isEven);
		System.out.println(result2.test(4)); //true
		System.out.println(result2.test(-2)); //false
		
		//negate()
		result2 = isPositive.negate();
		System.out.println(result2.test(5));
		// !(x>0)
		
		
		
		Function<String, String> remove = s -> s.replace(" ", "");
		Function<String, String> lower = s -> s.toLowerCase();
		Function<String, String> addPrefix = s -> "user_" + s;
		
		Function<String, String> pipeline = remove.andThen(lower.andThen(addPrefix));

		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String result3 = pipeline.apply(str);
		
		System.out.println(result3);
		
		

	}
}
